package com.blackjacksmart.reddragon.androidnekoapp.Notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;

import com.blackjacksmart.reddragon.androidnekoapp.Fragment.NotificationTriggerActivity;
import com.blackjacksmart.reddragon.androidnekoapp.R;

import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.GRID_LOOP;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.RANDOM_LIST;
import static com.blackjacksmart.reddragon.androidnekoapp.Controller.Controller.icons;

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

//------------------------------NOTIFICATION METHOD-------------------------------------------------

    public void initiateNotificationService(Intent intent){

        GRID_LOOP = true;

        int NOTIFICATION_ID = 555;

        intent = new Intent(this, NotificationTriggerActivity.class);

        int requestID = (int) System.currentTimeMillis();
        int flags = PendingIntent.FLAG_CANCEL_CURRENT;
        PendingIntent pendingIntent = PendingIntent.getActivity(this, requestID, intent, flags);

        Drawable drawable= ContextCompat.getDrawable(this,icons[RANDOM_LIST.get(0)]);

        Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("Marvel Alert:  ")
                .setContentText("Unlocked New Character!")
                .setSmallIcon(R.drawable.marvel_small_icon)
                .setLargeIcon(bitmap)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(NOTIFICATION_ID, notification);
    }

}
