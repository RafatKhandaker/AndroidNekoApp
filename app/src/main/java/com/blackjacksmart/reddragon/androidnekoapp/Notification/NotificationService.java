package com.blackjacksmart.reddragon.androidnekoapp.Notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.blackjacksmart.reddragon.androidnekoapp.Fragment.FragmentActivity;
import com.blackjacksmart.reddragon.androidnekoapp.R;

/**
 * Created by RedDragon on 12/13/16.
 *
 */

public class NotificationService extends IntentService {

    private static final String SERVICE_NAME = "marvel-notification";

    public NotificationService() {super(SERVICE_NAME);}

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        initiateNotificationService(intent);


    }

    public void initiateNotificationService(Intent intent){
        int NOTIFICATION_ID = 555;

        intent = new Intent(this, FragmentActivity.class);

        int requestID = (int) System.currentTimeMillis();
        int flags = PendingIntent.FLAG_CANCEL_CURRENT;
        PendingIntent pendingIntent = PendingIntent.getActivity(this, requestID, intent, flags);

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("Marvel Alert:  ")
                .setContentText("Unlocked New Character!")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(NOTIFICATION_ID, notification);
    }

}
