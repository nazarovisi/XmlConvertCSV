package com.aris.moneymachine.entites;

public class Bindes {

    private String userId;
    private String machineNumber;
    private String machineModel;
    private String depositNumber;
    private String packageNumber;
    private String startedAt;
    private String endedAt;
    private String sendedAt;
    private String rejectionExists;
    private String currencyCode;
    private String nominal;
    private String quantity;
    private String amount;
    private String rejected;

    public Bindes() {

    }

    public String getUserId() {
        return userId;
    }

    public Bindes setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public Bindes setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
        return this;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public Bindes setMachineModel(String machineModel) {
        this.machineModel = machineModel;
        return this;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public Bindes setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
        return this;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public Bindes setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public Bindes setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getEndedAt() {
        return endedAt;
    }

    public Bindes setEndedAt(String endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    public String getSendedAt() {
        return sendedAt;
    }

    public Bindes setSendedAt(String sendedAt) {
        this.sendedAt = sendedAt;
        return this;
    }

    public String getRejectionExists() {
        return rejectionExists;
    }

    public Bindes setRejectionExists(String rejectionExists) {
        this.rejectionExists = rejectionExists;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Bindes setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public String getNominal() {
        return nominal;
    }

    public Bindes setNominal(String nominal) {
        this.nominal = nominal;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public Bindes setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public Bindes setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getRejected() {
        return rejected;
    }

    public Bindes setRejected(String rejected) {
        this.rejected = rejected;
        return this;
    }

    @Override
    public String toString() {
        return "Bindes{" +
                "userId='" + userId + '\'' +
                ", machineNumber='" + machineNumber + '\'' +
                ", machineModel='" + machineModel + '\'' +
                ", depositNumber='" + depositNumber + '\'' +
                ", packageNumber='" + packageNumber + '\'' +
                ", startedAt='" + startedAt + '\'' +
                ", endedAt='" + endedAt + '\'' +
                ", sendedAt='" + sendedAt + '\'' +
                ", rejectionExists='" + rejectionExists + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", nominal='" + nominal + '\'' +
                ", quantity='" + quantity + '\'' +
                ", amount='" + amount + '\'' +
                ", rejected='" + rejected + '\'' +
                '}';
    }
}
