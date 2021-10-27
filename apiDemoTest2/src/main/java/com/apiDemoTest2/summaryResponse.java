package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "summaryResponse")
public class summaryResponse {
    public summaryResponse(){}

    private int transactionId;
    private int errCode;
    private List<Summary> summary;

    public summaryResponse
            (int transactionId, int errCode, List<Summary> summary){
        super();
        this.transactionId = transactionId;
        this.errCode = errCode;
        this.summary = summary;
    }
    @XmlElement
    public int getTransactionId() {return transactionId;}
    public void setTransactionId(int transactionId) {this.transactionId = transactionId;}

    @XmlElement
    public int getErrCode() {return errCode;}
    public void setErrCode(int errCode) {this.errCode = errCode;}

    @XmlElement
    public List<Summary> getSummary() {return summary;}
    public void setSummary(List<Summary> summary) {this.summary = summary;}



}
