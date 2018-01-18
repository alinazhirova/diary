package com.zhirova.alina.mydiary;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zhirova.alina.mydiary.model.Singleton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ConstraintLayout curLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Singleton curSingleton = new Singleton();

        curLayout = findViewById(R.id.main_activity);
        curLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(MainActivity.this, RecordActivity.class);
                startActivity(curIntent);
            }
        });
    }


}
