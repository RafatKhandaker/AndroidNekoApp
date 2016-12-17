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

// Define an intent to trigger when notification is selected (in this case to open an activity)
        intent = new Intent(this, FragmentActivity.class);

// Turn this into a PendingIntent
        int requestID = (int) System.currentTimeMillis(); // Unique requestID to differentiate between various notification with same notification ID
        int flags = PendingIntent.FLAG_CANCEL_CURRENT; // Cancel old intent and create new one
        PendingIntent pendingIntent = PendingIntent.getActivity(this, requestID, intent, flags);

// Attach the pendingIntent to a new notification using setContentIntent
        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("Marvel Alert:  ")
                .setContentText("Unlocked New Character!")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true) // Hides the notification after its been selected
                .build();

// Get the notification manager system service
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

// Setting a notification ID allows you to update the notification later on.
        notificationManager.notify(NOTIFICATION_ID, notification);
    }

}
