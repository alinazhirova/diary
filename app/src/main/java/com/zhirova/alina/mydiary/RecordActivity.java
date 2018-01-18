package com.zhirova.alina.mydiary;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.zhirova.alina.mydiary.model.Record;
import com.zhirova.alina.mydiary.model.Singleton;

import java.util.Calendar;

public class RecordActivity extends AppCompatActivity {

    public static final String RECORD_INDEX = "record";
    private static final String TAG = "RecordActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        initSpinner();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_gallery:
                Toast curToast = Toast.makeText(this, "Photo opening is in developing", Toast.LENGTH_SHORT);
                curToast.show();
                return true;
            case R.id.action_save:
                recordSaving();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void initSpinner() {
//        Integer[] smilesTempArray = new Integer[0];
//        int i = 0;
//
//        for (int value : Singleton.getLinkBetweenDescriptionAndSmile().values()) {
//            smilesTempArray[i] = value;
//            i++;
//        }

        SimpleImageArrayAdapter adapter = new SimpleImageArrayAdapter(this, new Integer[]{R.drawable.ic_smile_confused, R.drawable.ic_smile_cool, R.drawable.ic_smile_happy, R.drawable.ic_smile_in_love, R.drawable.ic_smile_kiss});
        Spinner smileSpinner = findViewById(R.id.smile_spinner);
        smileSpinner.setAdapter(adapter);
    }


    private void recordSaving() {
        EditText titleEdit = findViewById(R.id.title_edit);
        String title = titleEdit.getText().toString();

        if (title.isEmpty()) {
            Toast curToast = Toast.makeText(this, R.string.error_no_title, Toast.LENGTH_SHORT);
            curToast.show();
        }
        else {
            EditText descEdit = findViewById(R.id.desc_edit);
            String description = descEdit.getText().toString();

            if (description.isEmpty()) {
                Toast curToast = Toast.makeText(this, R.string.error_no_description, Toast.LENGTH_SHORT);
                curToast.show();
            }
            else {
                Record curRecord = new Record(Calendar.getInstance(), title, "In love", description);
                Singleton.recordList.add(curRecord);
                int recordIndex = Singleton.recordList.size() - 1;

                Intent curIntent = new Intent(RecordActivity.this, SaveActivity.class);
                curIntent.putExtra(RECORD_INDEX, recordIndex);
                startActivity(curIntent);
            }
        }
    }


}
