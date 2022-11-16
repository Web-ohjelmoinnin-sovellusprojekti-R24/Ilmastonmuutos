package com.db.webproject.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class V1 {
    
    @Id
    private Integer Id;
    private  char Date;
    private  char TimeType;
    private  double Anomaly_deg_C_Global_NH_SH_2_Monthly;
    private  double Anomaly_deg_C_Northern_hemisphere;
    private  double Anomaly_deg_C_Southern_hemisphere;


    public V1() {
    }

    public V1(Integer Id, char Date, char TimeType, double Anomaly_deg_C_Global_NH_SH_2_Monthly, double Anomaly_deg_C_Northern_hemisphere, double Anomaly_deg_C_Southern_hemisphere) {
        this.Id = Id;
        this.Date = Date;
        this.TimeType = TimeType;
        this.Anomaly_deg_C_Global_NH_SH_2_Monthly = Anomaly_deg_C_Global_NH_SH_2_Monthly;
        this.Anomaly_deg_C_Northern_hemisphere = Anomaly_deg_C_Northern_hemisphere;
        this.Anomaly_deg_C_Southern_hemisphere = Anomaly_deg_C_Southern_hemisphere;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public char getDate() {
        return this.Date;
    }

    public void setDate(char Date) {
        this.Date = Date;
    }

    public char getTimeType() {
        return this.TimeType;
    }

    public void setTimeType(char TimeType) {
        this.TimeType = TimeType;
    }

    public double getAnomaly_deg_C_Global_NH_SH_2_Monthly() {
        return this.Anomaly_deg_C_Global_NH_SH_2_Monthly;
    }

    public void setAnomaly_deg_C_Global_NH_SH_2_Monthly(double Anomaly_deg_C_Global_NH_SH_2_Monthly) {
        this.Anomaly_deg_C_Global_NH_SH_2_Monthly = Anomaly_deg_C_Global_NH_SH_2_Monthly;
    }

    public double getAnomaly_deg_C_Northern_hemisphere() {
        return this.Anomaly_deg_C_Northern_hemisphere;
    }

    public void setAnomaly_deg_C_Northern_hemisphere(double Anomaly_deg_C_Northern_hemisphere) {
        this.Anomaly_deg_C_Northern_hemisphere = Anomaly_deg_C_Northern_hemisphere;
    }

    public double getAnomaly_deg_C_Southern_hemisphere() {
        return this.Anomaly_deg_C_Southern_hemisphere;
    }

    public void setAnomaly_deg_C_Southern_hemisphere(double Anomaly_deg_C_Southern_hemisphere) {
        this.Anomaly_deg_C_Southern_hemisphere = Anomaly_deg_C_Southern_hemisphere;
    }

}