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
    private String VisualizationType;
    private String viewText1;
    private String viewText2;
    private String viewText3;
    private String viewText4;
    private String viewText5;
    private String viewText6;
    private String viewText7;
    private String viewText8;
    private String viewText9;
    private String viewText10;
    private boolean V1;
    private boolean V2;
    private boolean V3;
    private boolean V4;
    private boolean V5;
    private boolean V6;
    private boolean V7;
    private boolean V8;
    private boolean V9;
    private boolean V10;

    @Column(name="UserID")
    public int UserID;

    public UserViews() {
    }

    public UserViews(int UserViewsID, int Layout, String VisualizationType, String viewText1, String viewText2, String viewText3, String viewText4, String viewText5, String viewText6, String viewText7, String viewText8, String viewText9, String viewText10, boolean V1, boolean V2, boolean V3, boolean V4, boolean V5, boolean V6, boolean V7, boolean V8, boolean V9, boolean V10) {
        this.UserViewsID = UserViewsID;
        this.Layout = Layout;
        this.VisualizationType = VisualizationType;
        this.viewText1 = viewText1;
        this.viewText2 = viewText2;
        this.viewText3 = viewText3;
        this.viewText4 = viewText4;
        this.viewText5 = viewText5;
        this.viewText6 = viewText6;
        this.viewText7 = viewText7;
        this.viewText8 = viewText8;
        this.viewText9 = viewText9;
        this.viewText10 = viewText10;
        this.V1 = V1;
        this.V2 = V2;
        this.V3 = V3;
        this.V4 = V4;
        this.V5 = V5;
        this.V6 = V6;
        this.V7 = V7;
        this.V8 = V8;
        this.V9 = V9;
        this.V10 = V10;
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

    public String getVisualizationType() {
        return this.VisualizationType;
    }

    public void setVisualizationType(String VisualizationType) {
        this.VisualizationType = VisualizationType;
    }

    public String getViewText1() {
        return this.viewText1;
    }

    public void setViewText1(String viewText1) {
        this.viewText1 = viewText1;
    }

    public String getViewText2() {
        return this.viewText2;
    }

    public void setViewText2(String viewText2) {
        this.viewText2 = viewText2;
    }

    public String getViewText3() {
        return this.viewText3;
    }

    public void setViewText3(String viewText3) {
        this.viewText3 = viewText3;
    }

    public String getViewText4() {
        return this.viewText4;
    }

    public void setViewText4(String viewText4) {
        this.viewText4 = viewText4;
    }

    public String getViewText5() {
        return this.viewText5;
    }

    public void setViewText5(String viewText5) {
        this.viewText5 = viewText5;
    }

    public String getViewText6() {
        return this.viewText6;
    }

    public void setViewText6(String viewText6) {
        this.viewText6 = viewText6;
    }

    public String getViewText7() {
        return this.viewText7;
    }

    public void setViewText7(String viewText7) {
        this.viewText7 = viewText7;
    }

    public String getViewText8() {
        return this.viewText8;
    }

    public void setViewText8(String viewText8) {
        this.viewText8 = viewText8;
    }

    public String getViewText9() {
        return this.viewText9;
    }

    public void setViewText9(String viewText9) {
        this.viewText9 = viewText9;
    }

    public String getViewText10() {
        return this.viewText10;
    }

    public void setViewText10(String viewText10) {
        this.viewText10 = viewText10;
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

    public boolean isV2() {
        return this.V2;
    }

    public boolean getV2() {
        return this.V2;
    }

    public void setV2(boolean V2) {
        this.V2 = V2;
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

    public boolean isV4() {
        return this.V4;
    }

    public boolean getV4() {
        return this.V4;
    }

    public void setV4(boolean V4) {
        this.V4 = V4;
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

    public boolean isV8() {
        return this.V8;
    }

    public boolean getV8() {
        return this.V8;
    }

    public void setV8(boolean V8) {
        this.V8 = V8;
    }

    public boolean isV9() {
        return this.V9;
    }

    public boolean getV9() {
        return this.V9;
    }

    public void setV9(boolean V9) {
        this.V9 = V9;
    }

    public boolean isV10() {
        return this.V10;
    }

    public boolean getV10() {
        return this.V10;
    }

    public void setV10(boolean V10) {
        this.V10 = V10;
    }


    
}
