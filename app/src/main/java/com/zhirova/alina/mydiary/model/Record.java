package com.zhirova.alina.mydiary.model;

import android.media.Image;
import java.util.Calendar;

/**
 * Created by Admin on 27.12.2017.
 */

public class Record {

    private Calendar date;
    private String title;
    private String feeling;
    private String description;
    //private Image[] imagesList;


    public Record(Calendar date, String title, String feeling, String description) {
        this.date = date;
        this.title = title;
        this.feeling = feeling;
        this.description = description;
    }


    public Calendar getDate() {
        return date;
    }


    public String getTitle() {
        return title;
    }


    public String getFeeling() {
        return feeling;
    }


    public String getDescription() {
        return description;
    }


//    public Image[] getImagesList() {
//        return imagesList;
//    }


}
