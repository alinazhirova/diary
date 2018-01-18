package com.zhirova.alina.mydiary.model;

import com.zhirova.alina.mydiary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 09.01.2018.
 */

public class Singleton {

    public static ArrayList<Record> recordList;
    private static Map<String, Integer> linkBetweenDescriptionAndSmile;


    public Singleton() {
        recordList = new ArrayList<Record>();
        linkBetweenDescriptionAndSmile = new HashMap<String, Integer>();

        linkBetweenDescriptionAndSmile.put("Happy", R.drawable.ic_smile_happy);
        linkBetweenDescriptionAndSmile.put("Cool", R.drawable.ic_smile_cool);
        linkBetweenDescriptionAndSmile.put("In love", R.drawable.ic_smile_in_love);
        linkBetweenDescriptionAndSmile.put("Confused", R.drawable.ic_smile_confused);
        linkBetweenDescriptionAndSmile.put("Crying", R.drawable.ic_smile_crying);
        linkBetweenDescriptionAndSmile.put("Tongue", R.drawable.ic_smile_tongue);
        linkBetweenDescriptionAndSmile.put("Kiss", R.drawable.ic_smile_kiss);
    }


    public static Map<String, Integer> getLinkBetweenDescriptionAndSmile() {
        return linkBetweenDescriptionAndSmile;
    }


}
