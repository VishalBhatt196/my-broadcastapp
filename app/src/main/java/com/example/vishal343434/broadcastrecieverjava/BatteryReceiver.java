package com.example.vishal343434.broadcastrecieverjava;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {
    TextView tv1;

    public BatteryReceiver(TextView tv) {
        this.tv1=tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int percent = intent.getIntExtra("level", 0);
        if (percent != 0) {
            tv1.setText(percent + "%");
        }
    }
}
