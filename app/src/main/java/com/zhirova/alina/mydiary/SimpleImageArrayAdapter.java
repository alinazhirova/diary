package com.zhirova.alina.mydiary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhirova.alina.mydiary.model.Singleton;

/**
 * Created by Admin on 11.01.2018.
 */

public class SimpleImageArrayAdapter extends ArrayAdapter<Integer> {
    private Integer[] images;

    public SimpleImageArrayAdapter(Context context, Integer[] images) {
        super(context, android.R.layout.simple_spinner_item, images);
        this.images = images;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position);
    }

    private View getImageForPosition(int position) {
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(images[position]);
        imageView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return imageView;

//        LayoutInflater inflater = getLayoutInflater();
//        View row = inflater.inflate(R.layout.row, parent, false);
//        TextView label = row.findViewById(R.id.smile_desc);
//        label.setText(Singleton.getLinkBetweenDescriptionAndSmile().get(position));
//
//        ImageView icon = (ImageView) row.findViewById(R.id.icon);
//        icon.setImageResource(R.drawable.paw_on);
//
//        return row;
    }


}