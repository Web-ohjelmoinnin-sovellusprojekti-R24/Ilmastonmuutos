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
    @Column(name = "co2")
    private BigDecimal co2;
    @Column(name = "temp")
    private BigDecimal temp;
    @Column(name = "sector")
    private String sector;
    @Column(name = "sector_percent")
    private BigDecimal sector_percent;
    @Column(name = "sub_percent")
    private BigDecimal sub_percent;
    @Column(name = "sub_sector")
    private String sub_sector;


    public Visualizations() {
    }

    public Visualizations(Integer id, String date, String time_type, BigDecimal globald, BigDecimal northernd, BigDecimal southernd, BigDecimal globalc, BigDecimal annualavg, BigDecimal monthlyavg, BigDecimal de08, BigDecimal de08_2, BigDecimal dss, BigDecimal vostok, BigDecimal co2, BigDecimal temp, String sector, BigDecimal sector_percent, BigDecimal sub_percent, String sub_sector) {
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
        this.co2 = co2;
        this.temp = temp;
        this.sector = sector;
        this.sector_percent = sector_percent;
        this.sub_percent = sub_percent;
        this.sub_sector = sub_sector;
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

    public BigDecimal getCo2() {
        return this.co2;
    }

    public void setCo2(BigDecimal co2) {
        this.co2 = co2;
    }

    public BigDecimal getTemp() {
        return this.temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public BigDecimal getSector_percent() {
        return this.sector_percent;
    }

    public void setSector_percent(BigDecimal sector_percent) {
        this.sector_percent = sector_percent;
    }

    public BigDecimal getSub_percent() {
        return this.sub_percent;
    }

    public void setSub_percent(BigDecimal sub_percent) {
        this.sub_percent = sub_percent;
    }

    public String getSub_sector() {
        return this.sub_sector;
    }

    public void setSub_sector(String sub_sector) {
        this.sub_sector = sub_sector;
    }

    public Visualizations id(Integer id) {
        setId(id);
        return this;
    }

    public Visualizations date(String date) {
        setDate(date);
        return this;
    }

    public Visualizations time_type(String time_type) {
        setTime_type(time_type);
        return this;
    }

    public Visualizations globald(BigDecimal globald) {
        setGlobald(globald);
        return this;
    }

    public Visualizations northernd(BigDecimal northernd) {
        setNorthernd(northernd);
        return this;
    }

    public Visualizations southernd(BigDecimal southernd) {
        setSouthernd(southernd);
        return this;
    }

    public Visualizations globalc(BigDecimal globalc) {
        setGlobalc(globalc);
        return this;
    }

    public Visualizations annualavg(BigDecimal annualavg) {
        setAnnualavg(annualavg);
        return this;
    }

    public Visualizations monthlyavg(BigDecimal monthlyavg) {
        setMonthlyavg(monthlyavg);
        return this;
    }

    public Visualizations de08(BigDecimal de08) {
        setDe08(de08);
        return this;
    }

    public Visualizations de08_2(BigDecimal de08_2) {
        setDe08_2(de08_2);
        return this;
    }

    public Visualizations dss(BigDecimal dss) {
        setDss(dss);
        return this;
    }

    public Visualizations vostok(BigDecimal vostok) {
        setVostok(vostok);
        return this;
    }

    public Visualizations co2(BigDecimal co2) {
        setCo2(co2);
        return this;
    }

    public Visualizations temp(BigDecimal temp) {
        setTemp(temp);
        return this;
    }

    public Visualizations sector(String sector) {
        setSector(sector);
        return this;
    }

    public Visualizations sector_percent(BigDecimal sector_percent) {
        setSector_percent(sector_percent);
        return this;
    }

    public Visualizations sub_percent(BigDecimal sub_percent) {
        setSub_percent(sub_percent);
        return this;
    }

    public Visualizations sub_sector(String sub_sector) {
        setSub_sector(sub_sector);
        return this;
    }

    
}