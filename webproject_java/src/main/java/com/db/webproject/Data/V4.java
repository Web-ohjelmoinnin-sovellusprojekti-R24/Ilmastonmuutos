package com.db.webproject.Data;

import java.math.BigDecimal;

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
    @Column(name ="de08")
    private BigDecimal de08;
    @Column(name ="de082")
    private BigDecimal de082;
    @Column(name ="dss")
    private BigDecimal dss;
    @Column(name = "year")
    private double year;


    public V4() {
    }

    public V4(Integer ID, BigDecimal de08, BigDecimal de082, BigDecimal dss, double year) {
        this.ID = ID;
        this.de08 = de08;
        this.de082 = de082;
        this.dss = dss;
        this.year = year;
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public BigDecimal getDe08() {
        return this.de08;
    }

    public void setDe08(BigDecimal de08) {
        this.de08 = de08;
    }

    public BigDecimal getDe082() {
        return this.de082;
    }

    public void setDe082(BigDecimal de082) {
        this.de082 = de082;
    }

    public BigDecimal getDss() {
        return this.dss;
    }

    public void setDss(BigDecimal dss) {
        this.dss = dss;
    }

    public double getYear() {
        return this.year;
    }

    public void setYear(double year) {
        this.year = year;
    }
    
}


   