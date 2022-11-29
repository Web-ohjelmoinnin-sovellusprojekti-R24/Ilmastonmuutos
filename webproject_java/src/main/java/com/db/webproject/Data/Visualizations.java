package com.db.webproject.Data;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visualizations {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private  String date;
    @Column(name = "time_type")
    private  String time_type;
    @Column(name = "globald")
    private  BigDecimal globald;
    @Column(name = "northernd")
    private  BigDecimal northernd;
    @Column(name = "southernd")
    private  BigDecimal southernd;
    @Column(name = "globalc")
    private  BigDecimal globalc;
    @Column(name = "annualavg")
    private  BigDecimal annualavg;
    @Column(name = "monthlyavg")
    private  BigDecimal monthlyavg;


    public Visualizations() {
    }

    public Visualizations(Integer id, String date, String time_type, BigDecimal globald, BigDecimal northernd, BigDecimal southernd, BigDecimal globalc, BigDecimal annualavg, BigDecimal monthlyavg) {
        this.id = id;
        this.date = date;
        this.time_type = time_type;
        this.globald = globald;
        this.northernd = northernd;
        this.southernd = southernd;
        this.globalc = globalc;
        this.annualavg = annualavg;
        this.monthlyavg = monthlyavg;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime_type() {
        return this.time_type;
    }

    public void setTime_type(String time_type) {
        this.time_type = time_type;
    }

    public BigDecimal getGlobald() {
        return this.globald;
    }

    public void setGlobald(BigDecimal globald) {
        this.globald = globald;
    }

    public BigDecimal getNorthernd() {
        return this.northernd;
    }

    public void setNorthernd(BigDecimal northernd) {
        this.northernd = northernd;
    }

    public BigDecimal getSouthernd() {
        return this.southernd;
    }

    public void setSouthernd(BigDecimal southernd) {
        this.southernd = southernd;
    }

    public BigDecimal getGlobalc() {
        return this.globalc;
    }

    public void setGlobalc(BigDecimal globalc) {
        this.globalc = globalc;
    }

    public BigDecimal getAnnualavg() {
        return this.annualavg;
    }

    public void setAnnualavg(BigDecimal annualavg) {
        this.annualavg = annualavg;
    }

    public BigDecimal getMonthlyavg() {
        return this.monthlyavg;
    }

    public void setMonthlyavg(BigDecimal monthlyavg) {
        this.monthlyavg = monthlyavg;
    }

}
