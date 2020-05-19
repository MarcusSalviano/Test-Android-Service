package com.test.test_android_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.btn_start);

        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==start) {
            Intent serviceIntent = new Intent(this, LinkedListService.class);
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("abc");
            linkedList.add("cba");
            linkedList.add("abc");
            linkedList.add("aaa");
            linkedList.add("abc");
            linkedList.add("abc");
            linkedList.add("ddd");
            linkedList.add("aaa");
            linkedList.add("abc");
            Log.d("LinkedListService", linkedList.toString());
            serviceIntent.putExtra("LinkedList", linkedList);
            startService(serviceIntent);
        }
    }
}
