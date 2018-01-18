package com.zhirova.alina.mydiary;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.zhirova.alina.mydiary.model.Record;
import com.zhirova.alina.mydiary.model.Singleton;

public class SaveActivity extends AppCompatActivity {

    private static final String TAG = "SaveActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        int recordIndex = getIntent().getExtras().getInt(RecordActivity.RECORD_INDEX);
        Record curRecord = Singleton.recordList.get(recordIndex);

        TextView titleTextView = findViewById(R.id.title_text_view);
        titleTextView.setText(curRecord.getTitle());

        TextView smileTextView = findViewById(R.id.smile_text_view);
        smileTextView.setText(curRecord.getFeeling());

        TextView descTextView = findViewById(R.id.desc_text_view);
        descTextView.setText(curRecord.getDescription());
    }


}
