package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Day {

    public Day(){}

    private List<Voice> voice;
    private String Internet;
    private String SMS;
    private String Date;
    private int TotalSumOfDate;

    public Day (
            String Internet, String SMS, List<Voice> voice,
             String Date, int TotalSumOfDate
    ){
        super();
        this.Internet = Internet;
        this.SMS = SMS;
        this.voice = voice;
        this.Date = Date;
        this.TotalSumOfDate = TotalSumOfDate;
    }
    @XmlElement
    public String getDate(){return Date;}

    public void setDate(String date) {
        Date = date;
    }
@XmlElement
    public int getTotalSumOfDate() {
        return TotalSumOfDate;
    }

    public void setTotalSumOfDate(int totalSumOfDate) {
        TotalSumOfDate = totalSumOfDate;
    }

    @XmlElement
    public String getInternet() {return Internet;}

    public void setInternet(String internet) {
        Internet = internet;
    }

    @XmlElement
    public String getSMS() {return SMS;}

    public void setSMS(String SMS) {
        this.SMS = SMS;
    }

    @XmlElement
    public List<Voice> getVoice() {return voice;}

    public void setVoice(List<Voice> voice) {
        this.voice = voice;
    }
}
