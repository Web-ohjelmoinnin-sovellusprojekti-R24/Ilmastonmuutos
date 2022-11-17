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


    @Column(name="UserID")
    public int UserID;

    
}
