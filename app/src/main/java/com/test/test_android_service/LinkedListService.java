package com.test.test_android_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListService  extends Service {
    private MediaPlayer mediaPlayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle extras = intent.getExtras();

        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> linkedListArray = (ArrayList<String>) extras.get("LinkedList");

        for(String value: linkedListArray) {
            linkedList.add(value);
        }

        Log.d("LinkedListService", new LinkedListUtils().removeDuplicate(linkedList).toString());
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
