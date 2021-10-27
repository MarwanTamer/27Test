package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlRootElement;

public class Summary {

    public Summary() {}

    private String Date;
    private String Usage;
    private String Type;
    private int UsageTypeID;
    private int Price;

    public Summary(
      String Date, String Usage, String Type, int UsageTypeID, int Price
    ){
        super();
        this.Date = Date;
        this.Usage = Usage;
        this.Type = Type;
        this.UsageTypeID = UsageTypeID;
        this.Price = Price;
    }

    public String  getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getUsageTypeID() {
        return UsageTypeID;
    }

    public void setUsageTypeID(int usageTypeID) {
        UsageTypeID = usageTypeID;
    }

    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}
