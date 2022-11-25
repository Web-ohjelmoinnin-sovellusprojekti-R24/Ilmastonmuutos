package com.db.webproject.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class V4 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer ID;
    @Column(name = "code")
    private char Code;
    @Column(name = "co2")
    private double co2;
    @Column(name = "year")
    private double year;


    public V4() {
    }

    public V4(Integer ID, char Code, double co2, double year) {
        this.ID = ID;
        this.Code = Code;
        this.co2 = co2;
        this.year = year;
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public char getCode() {
        return this.Code;
    }

    public void setCode(char Code) {
        this.Code = Code;
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
