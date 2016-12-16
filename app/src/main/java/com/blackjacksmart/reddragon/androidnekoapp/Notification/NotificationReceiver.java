package com.blackjacksmart.reddragon.androidnekoapp.Notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by RedDragon on 12/13/16.
 */

public class NotificationReceiver extends BroadcastReceiver {

    public static final int REQUEST_CODE = 12345;
    public static final String ACTION = "nyc.c4q.notificationdemo.alarm";

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, NotificationService.class);
        context.startService(i);
    }
}
