package com.object.practice.api.notification.dto;

import com.object.practice.api.notification.provider.NotificationProvider;

public record NotificationSendRequestDTO(
        String message,
        NotificationProvider notificationProvider
) {

    public String getProviderName() {
        return notificationProvider.getNotificationName();
    }

}