package com.blackjacksmart.reddragon.androidnekoapp.Notification;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by RedDragon on 12/13/16.
 */

public class BootBroadcastReceiver extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, NotificationService.class);
        startWakefulService(context, startServiceIntent);
    }
}
