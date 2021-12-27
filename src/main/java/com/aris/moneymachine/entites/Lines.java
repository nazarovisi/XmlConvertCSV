package com.aris.moneymachine.entites;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


public class Lines {
    public String nominal;
    public String serialNumber;
    public String suitableForAtm;
    public String fit;
    public String unfit;
    public String errorCode;



    public Lines() {

    }

    public String getNominal() {
        return nominal;
    }

    public Lines setNominal(String nominal) {
        this.nominal = nominal;
        return this;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Lines setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getSuitableForAtm() {
        return suitableForAtm;
    }

    public Lines setSuitableForAtm(String suitableForAtm) {
        this.suitableForAtm = suitableForAtm;
        return this;
    }

    public String getFit() {
        return fit;
    }

    public Lines setFit(String fit) {
        this.fit = fit;
        return this;
    }

    public String getUnfit() {
        return unfit;
    }

    public Lines setUnfit(String unfit) {
        this.unfit = unfit;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public Lines setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "nominal='" + nominal + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", suitableForAtm='" + suitableForAtm + '\'' +
                ", fit='" + fit + '\'' +
                ", unfit='" + unfit + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
