package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name ="detailedInquiry")
public class detailedInquiry {
    public detailedInquiry(){}

    private int transactionId;
    private int errCode;
    private List<consumptionDates> consumptionDates;

    public detailedInquiry(
            int transactionId, int errCode, List<consumptionDates> consumptionDates){
        super();
        this.transactionId = transactionId;
        this.errCode = errCode;
        this.consumptionDates = consumptionDates;
    }
    @XmlElement
    public int getTransactionId() {return transactionId;}
    public void setTransactionId(int transactionId) {this.transactionId = transactionId;}

    @XmlElement
    public int getErrCode() {return errCode;}
    public void setErrCode(int errCode) {this.errCode = errCode;}

    @XmlElement
    public List<consumptionDates> getConsumptionDates() {return consumptionDates;}
    public void setSummary(List<consumptionDates> consumptionDates) {this.consumptionDates = consumptionDates;}
}
