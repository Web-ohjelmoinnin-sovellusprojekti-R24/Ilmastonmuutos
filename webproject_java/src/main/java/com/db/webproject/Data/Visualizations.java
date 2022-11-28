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
    @Column(name = "sector")
    private  String sector;
    @Column(name = "sub_sector")
    private  String sub_sector;
    @Column(name = "sector_percent")
    private  BigDecimal sector_percent;
    @Column(name = "sub_sector_percent")
    private  BigDecimal sub_sector_percent;


    public Visualizations() {
    }

    public Visualizations(Integer id, String date, String time_type, BigDecimal globald, BigDecimal northernd, BigDecimal southernd, BigDecimal globalc, String sector, String sub_sector, BigDecimal sector_percent, BigDecimal sub_sector_percent) {
        this.id = id;
        this.date = date;
        this.time_type = time_type;
        this.globald = globald;
        this.northernd = northernd;
        this.southernd = southernd;
        this.globalc = globalc;
        this.sector = sector;
        this.sub_sector = sub_sector;
        this.sector_percent = sector_percent;
        this.sub_sector_percent = sub_sector_percent;
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


    public void setGlobalc(BigDecimal globalc) {
        this.globalc = globalc;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSub_sector() {
        return this.sub_sector;
    }

    public void setSub_sector(String sub_sector) {
        this.sub_sector = sub_sector;
    }

    public BigDecimal getSector_percent() {
        return this.sector_percent;
    }

    public void setSector_percent(BigDecimal sector_percent) {
        this.sector_percent = sector_percent;
    }

    public BigDecimal getSub_sector_percent() {
        return this.sub_sector_percent;
    }

    public void setSub_sector_percent(BigDecimal sub_sector_percent) {
        this.sub_sector_percent = sub_sector_percent;
    }
}


