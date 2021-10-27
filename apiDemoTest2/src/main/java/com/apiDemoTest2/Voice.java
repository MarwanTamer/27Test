package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlElement;

public class Voice {
    public Voice(){}

    private int CALLINGNUMBER;
    private int CALLEDNUMBER;
    private String Usage;
    private String UsageTypeID;
    private String Type;
    private int Price;
    private String TransDate;
    private int Destination;
    private String DESCRIPTION;
    private String Info1;
    private String Info2;
    private String Info3;
    private String Info4;
    private String Info5;

    public Voice(
            int CALLINGNUMBER,
            int CALLEDNUMBER,
            String Usage,
            String UsageTypeID,
            String Type,
            int Price,
            String TransDate,
            int Destination,
            String DESCRIPTION,
            String Info1,
            String Info2,
            String Info3,
            String Info4,
            String Info5 ){
        super();
        this.CALLEDNUMBER = CALLEDNUMBER;
        this.CALLINGNUMBER = CALLINGNUMBER;
        this.Destination = Destination;
        this.DESCRIPTION = DESCRIPTION;
        this.Usage = Usage;
        this.UsageTypeID = UsageTypeID;
        this.Type = Type;
        this. Price = Price;
        this.TransDate = TransDate;
        this.Info1 = Info1;
        this.Info2 = Info2;
        this.Info3 = Info3;
        this.Info4 = Info4;
        this.Info5 = Info5;
    }
    @XmlElement
    public int getCALLINGNUMBER() {return CALLEDNUMBER;}

    public void setCALLINGNUMBER(int CALLINGNUMBER) {
        this.CALLINGNUMBER = CALLINGNUMBER;
    }

    @XmlElement
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @XmlElement
    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }

    @XmlElement
    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @XmlElement
    public int getCALLEDNUMBER() {
        return CALLEDNUMBER;
    }

    public void setCALLEDNUMBER(int CALLEDNUMBER) {
        this.CALLEDNUMBER = CALLEDNUMBER;
    }

    @XmlElement
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    @XmlElement
    public int getDestination() {
        return Destination;
    }

    public void setDestination(int destination) {
        Destination = destination;
    }

    @XmlElement
    public String getInfo1() {
        return Info1;
    }

    public void setInfo1(String info1) {
        Info1 = info1;
    }

    @XmlElement
    public String getInfo2() {
        return Info2;
    }

    public void setInfo2(String info2) {
        Info2 = info2;
    }

    @XmlElement
    public String getInfo3() {
        return Info3;
    }

    public void setInfo3(String info3) {
        Info3 = info3;
    }

    @XmlElement
    public String getInfo4() {
        return Info4;
    }

    public void setInfo4(String info4) {
        Info4 = info4;
    }

    @XmlElement
    public String getInfo5() {
        return Info5;
    }

    public void setInfo5(String info5) {
        Info5 = info5;
    }

    @XmlElement
    public String getTransDate() {
        return TransDate;
    }

    public void setTransDate(String transDate) {
        TransDate = transDate;
    }

    @XmlElement
    public String getUsageTypeID() {
        return UsageTypeID;
    }

    public void setUsageTypeID(String usageTypeID) {
        UsageTypeID = usageTypeID;
    }
}
