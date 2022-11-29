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
    @Column(name = "de08")
    private  BigDecimal de08;
    @Column(name = "de08_2")
    private  BigDecimal de08_2;
    @Column(name = "dss")
    private  BigDecimal dss;
    @Column(name = "vostok")
    private  BigDecimal vostok;

    public Visualizations() {
    }

    public Visualizations(Integer id, String date, String time_type, BigDecimal globald, BigDecimal northernd, BigDecimal southernd, BigDecimal globalc, BigDecimal annualavg, BigDecimal monthlyavg, BigDecimal de08, BigDecimal de08_2, BigDecimal dss, BigDecimal vostok) {
        this.id = id;
        this.date = date;
        this.time_type = time_type;
        this.globald = globald;
        this.northernd = northernd;
        this.southernd = southernd;
        this.globalc = globalc;
        this.annualavg = annualavg;
        this.monthlyavg = monthlyavg;
        this.de08 = de08;
        this.de08_2 = de08_2;
        this.dss = dss;
        this.vostok = vostok;
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

    public BigDecimal getDe08() {
        return this.de08;
    }

    public void setDe08(BigDecimal de08) {
        this.de08 = de08;
    }

    public BigDecimal getDe08_2() {
        return this.de08_2;
    }

    public void setDe08_2(BigDecimal de08_2) {
        this.de08_2 = de08_2;
    }

    public BigDecimal getDss() {
        return this.dss;
    }

    public void setDss(BigDecimal dss) {
        this.dss = dss;
    }

    public BigDecimal getVostok() {
        return this.vostok;
    }

    public void setVostok(BigDecimal vostok) {
        this.vostok = vostok;
    }



}