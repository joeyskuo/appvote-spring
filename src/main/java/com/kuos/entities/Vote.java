package com.kuos.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Shi on 9/30/2017.
 */
@Document
public class Vote {

    @Id
    private String id;
    private String appName;
    private Date date;


    public Vote(String appName) {
        this.appName = appName;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id='" + id + '\'' +
                ", appName='" + appName + '\'' +
                ", date=" + date +
                '}';
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Date getDate() {
        return date;
    }

}
