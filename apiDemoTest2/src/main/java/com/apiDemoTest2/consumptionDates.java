package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class consumptionDates {

    public consumptionDates(){}

    private List<Day> day;

    public consumptionDates(
            List<Day> day
    ){
        super();
        this.day = day;
    }
    @XmlElement
    public List<Day> getDay() {return day;}
    public void setDay(List<Day> day) {this.day = day;}
}
