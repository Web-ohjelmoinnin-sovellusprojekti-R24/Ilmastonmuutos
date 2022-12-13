package com.db.webproject.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserViews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserViewsID;
    private int Layout;
    private boolean V1;
    private boolean V3;
    private boolean V5;
    private boolean V6;
    private boolean V7;
    @Column(name = "username")
    private String UserID;

    public UserViews() {
    }

    public UserViews(int Layout, boolean V1, boolean V3, boolean V5, boolean V6, boolean V7) {
        this.Layout = Layout;
        this.V1 = V1;
        this.V3 = V3;
        this.V5 = V5;
        this.V6 = V6;
        this.V7 = V7;
    
    }



    public int getUserViewsID() {
        return this.UserViewsID;
    }

    public void setUserViewsID(int UserViewsID) {
        this.UserViewsID = UserViewsID;
    }

    public int getLayout() {
        return this.Layout;
    }

    public void setLayout(int Layout) {
        this.Layout = Layout;
    }

    public boolean isV1() {
        return this.V1;
    }

    public boolean getV1() {
        return this.V1;
    }

    public void setV1(boolean V1) {
        this.V1 = V1;
    }

    public boolean isV3() {
        return this.V3;
    }

    public boolean getV3() {
        return this.V3;
    }

    public void setV3(boolean V3) {
        this.V3 = V3;
    }

    public boolean isV5() {
        return this.V5;
    }

    public boolean getV5() {
        return this.V5;
    }

    public void setV5(boolean V5) {
        this.V5 = V5;
    }

    public boolean isV6() {
        return this.V6;
    }

    public boolean getV6() {
        return this.V6;
    }

    public void setV6(boolean V6) {
        this.V6 = V6;
    }

    public boolean isV7() {
        return this.V7;
    }

    public boolean getV7() {
        return this.V7;
    }

    public void setV7(boolean V7) {
        this.V7 = V7;
    }
    
    public String getUserID() {
        return this.UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }


}
