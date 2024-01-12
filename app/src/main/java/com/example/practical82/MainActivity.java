package com.example.practical82;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] subjects={"Management","Python","Mobile application development","Emerging Trends in computer","Wed Based Application development php","Entrepreneurship development","Capstone Project Execution"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,subjects);
        AutoCompleteTextView actv =(AutoCompleteTextView) findViewById(R.id.sub);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                {
                    Toast.makeText(getApplicationContext(), "selected item" + parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}