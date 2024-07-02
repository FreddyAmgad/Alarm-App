package com.example.alarmclock;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class AlarmRecieevr extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        final Intent i = new Intent(context, Destination.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendi=  PendingIntent.getActivity(context,0,i,0);//study this line
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"Trying the Alaram")
                .setSmallIcon(R.drawable.clock)
                .setContentTitle("Alarm Wake Up")
                .setContentText("Subscribe For Android related Content")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setPriority(NotificationCompat.PRIORITY_HIGH);
        NotificationManagerCompat notificationManagerCompat= NotificationManagerCompat.from(context);
        notificationManagerCompat.notify(123,builder.build());
    }
}
