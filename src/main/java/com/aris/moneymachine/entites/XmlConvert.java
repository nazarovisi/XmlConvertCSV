package com.aris.moneymachine.entites;

import org.w3c.dom.*;

import javax.annotation.PostConstruct;
import javax.sound.sampled.Line;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class XmlConvert {
    private static final String FILENAME = "T_K21F05-A04768_20211206144632274.xml";
    private static final String COMMA_DELIMITER = ",";
    private static final String LINE_SEPARATOR = "\n";
    private static final String HEADER = "Nominal, SerialNumber, SuitableForAtm, Fit, Unfit, ErrorCode";
    public static void main(String[] args) {
        saveBind("test.csv");
        saveLines("sss.csv");

    }

    public static void saveLines(String fileName){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        String HEADER = "Nominal, SerialNumber, SuitableForAtm, Fit, Unfit, ErrorCode";
        try(FileWriter fileWriter = new FileWriter("C:\\document\\"+fileName)) {

            fileWriter.append(HEADER);
            fileWriter.append(LINE_SEPARATOR);
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);


            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));


            doc.getDocumentElement().normalize();

            System.out.println("SortResult :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");


            NodeList list = doc.getElementsByTagName("line");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    ArrayList<Lines> listLines = new ArrayList<>();
                    Lines lines = new Lines();
                    lines.setNominal(element.getElementsByTagName("nominal").item(0).getTextContent()) ;
                    lines.setSerialNumber(element.getElementsByTagName("SN").item(0).getTextContent());
                    lines.setSuitableForAtm(element.getElementsByTagName("ATM").item(0).getTextContent());
                    lines.setFit(element.getElementsByTagName("FIT").item(0).getTextContent());
                    lines.setUnfit(element.getElementsByTagName("Unfit").item(0).getTextContent());
                    lines.setErrorCode(element.getElementsByTagName("ERROR").item(0).getTextContent());
                    listLines.add(lines);
                    System.out.println(lines);
                    for (Lines lines1:listLines){
                        fileWriter.append((lines1.getNominal()) + ",");
                        fileWriter.append((lines1.getSerialNumber()) + ",");
                        fileWriter.append((lines1.getSuitableForAtm())+ ",");
                        fileWriter.append((lines1.getFit())+ ",");
                        fileWriter.append((lines1.getUnfit()) + ",");
                        fileWriter.append((lines1.getErrorCode()));
                        fileWriter.append(LINE_SEPARATOR);

                    }

                }

            }

        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
    }


    public static void saveBind(String fileName){
        String HEADER = "UserID\tMachineNumber\tMachineModel\tDepositNumber\tPackageNumber\tStartedAt\tEndedAt\tSendedAt\tRejectionExists\tCurrencyCode\tNominal\tQuantity\tAmount()\tRejected";
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try(FileWriter fileWriter = new FileWriter("C:\\document\\"+fileName)) {

            fileWriter.append(HEADER);
            fileWriter.append(LINE_SEPARATOR);
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);


            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));


            doc.getDocumentElement().normalize();

            System.out.println("SortResult :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");


            NodeList list = doc.getElementsByTagName("SortResult");
            NodeList list1 = doc.getElementsByTagName("line");
            for (int temp = 0; temp < list1.getLength(); temp++) {

                Node node = list1.item(temp);
                Node node1 = list.item(0);
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element1 = (Element) node1;
                    Element element = (Element) node;
                    ArrayList<Bindes> listBindes = new ArrayList<>();
                    Bindes bindes = new Bindes();

                    bindes.setUserId(element1.getAttribute("UserID"));
                    bindes.setMachineNumber(element1.getAttribute("machineNumber"));
                    bindes.setMachineModel(element1.getAttribute("machine"));
                    bindes.setDepositNumber(element1.getAttribute("depositNumber"));
                    bindes.setPackageNumber(element1.getAttribute("packageNumber"));
                    bindes.setStartedAt(element1.getAttribute("startDateTime"));
                    bindes.setEndedAt(element1.getAttribute("endDateTime"));
                    bindes.setSendedAt(element1.getAttribute("sendDateTime"));
                    bindes.setRejectionExists(element1.getAttribute("rejectionExists"));
                    bindes.setCurrencyCode(element.getElementsByTagName("currencyCode").item(0).getTextContent());
                    bindes.setNominal(element.getElementsByTagName("nominal").item(0).getTextContent());
                    bindes.setQuantity(element.getElementsByTagName("qty").item(0).getTextContent());
                    int parseInt = Integer.parseInt(bindes.getQuantity()) * Integer.parseInt(bindes.getNominal());
                    bindes.setRejected(element.getElementsByTagName("rejected").item(0).getTextContent());
                    String parseAmount = String.valueOf(parseInt);
                    bindes.setAmount(parseAmount);
                    listBindes.add(bindes);
                    System.out.println(bindes);
                    for (Bindes bindes1:listBindes){
                        fileWriter.append(bindes1.getUserId()+ ",");
                        fileWriter.append(bindes1.getMachineNumber()+ ",");
                        fileWriter.append(bindes1.getMachineModel()+ ",");
                        fileWriter.append(bindes1.getDepositNumber()+ ",");
                        fileWriter.append(bindes1.getPackageNumber()+ ",");
                        fileWriter.append(bindes1.getStartedAt()+ ",");
                        fileWriter.append(bindes1.getEndedAt()+ ",");
                        fileWriter.append(bindes1.getSendedAt()+ ",");
                        fileWriter.append(bindes1.getRejectionExists()+ ",");
                        fileWriter.append(bindes1.getCurrencyCode()+ ",");
                        fileWriter.append(bindes1.getNominal()+ ",");
                        fileWriter.append(bindes1.getQuantity() + ",");
                        fileWriter.append(bindes1.getAmount()+ ",");
                        fileWriter.append(bindes1.getRejected() + ",");
                        fileWriter.append(LINE_SEPARATOR);

                    }

                }

            }

        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
    }
}


/*    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {


                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);


                DocumentBuilder db = dbf.newDocumentBuilder();

                Document doc = db.parse(new File(FILENAME));


                doc.getDocumentElement().normalize();

                System.out.println("SortResult :" + doc.getDocumentElement().getNodeName());
                System.out.println("------");


                NodeList list = doc.getElementsByTagName("SortResult");

                for (int temp = 0; temp < list.getLength(); temp++) {

        Node node = list.item(temp);

        if (node.getNodeType() == Node.ELEMENT_NODE) {

        Element element = (Element) node;


        String id = element.getAttribute("line");


        String line = element.getElementsByTagName("line").item(0).getTextContent();
        String lastname = element.getElementsByTagName("currencyCode").item(0).getTextContent();
        String nickname = element.getElementsByTagName("nominal").item(0).getTextContent();

        NodeList salaryNodeList = element.getElementsByTagName("salary");
        String salary = salaryNodeList.item(0).getTextContent();


        String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

        System.out.println("Current Element :" + node.getNodeName());
        System.out.println("Staff Id : " + id);
        System.out.println("First Name : " + line);
        System.out.println("Last Name : " + lastname);
        System.out.println("Nick Name : " + nickname);
        System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);

        }
        }

        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException e) {
        e.printStackTrace();
        }

        }*/
