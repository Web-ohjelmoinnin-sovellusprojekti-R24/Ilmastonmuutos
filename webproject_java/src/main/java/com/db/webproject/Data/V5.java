package com.db.webproject.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class V5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private double co2;
    private double year;
    

    public V5() {
    }

    public V5(Integer ID, double co2, double year) {
        this.ID = ID;
        this.co2 = co2;
        this.year = year;
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public double getCo2() {
        return this.co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getYear() {
        return this.year;
    }

    public void setYear(double year) {
        this.year = year;
    }


}
    
