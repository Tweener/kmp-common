package com.tweener.common.android.os.notification.notification

import android.app.PendingIntent
import android.content.Context
import android.graphics.Bitmap
import android.text.SpannableString
import androidx.core.app.NotificationCompat

/**
 * @author Vivien Mahe
 * @since 05/10/2023
 */
class NotificationFactory {

    companion object {

        fun create(
            context: Context,
            channelId: String,
            title: String,
            content: SpannableString,
            smallIcon: Int,
            largeIcon: Bitmap? = null,
            pendingIntent: PendingIntent? = null,
            autoCancel: Boolean = true
        ): NotificationCompat.Builder =
            NotificationCompat.Builder(context, channelId)
                .setSmallIcon(smallIcon)
                .setLargeIcon(largeIcon)
                .setContentTitle(title)
                .setContentText(content)
                .setStyle(NotificationCompat.BigTextStyle().bigText(content))
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(autoCancel) // Automatically remove the notification when the user taps it
    }
}
