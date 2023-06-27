package com.object.practice.api.notification.dto;

public record BadNotificationSendRequestDTO(
        String message,
        String notificationProvider
) {
}
