package org.fitznet.doomdns;

import org.apache.commons.math3.analysis.function.Add;

public class Client {
    private String date;
    private String caseNum;
    private String respondant;
    private Address address;

    public Client(String date, String caseNum, String respondant, Address address){
        this.date = date;
        this.caseNum = caseNum;
        this.respondant = respondant;
        this.address = address;
    }
    

    // SETTERS / GETTERS
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCaseNum() {
        return this.caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getRespondant() {
        return this.respondant;
    }

    public void setRespondant(String respondant) {
        this.respondant = respondant;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}