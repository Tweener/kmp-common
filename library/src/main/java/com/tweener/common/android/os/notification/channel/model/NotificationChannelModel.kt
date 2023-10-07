package com.tweener.common.android.os.notification.channel.model

import android.app.NotificationManager

/**
 * @author Vivien Mahe
 * @since 05/10/2023
 */
data class NotificationChannelModel(
    val channelId: String,
    val name: String,
    val importance: Int = NotificationManager.IMPORTANCE_DEFAULT,
    val description: String? = null
)
