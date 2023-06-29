package com.object.practice.api.notification.service;

import com.object.practice.api.notification.dto.NotificationSendRequestDTO;

/**
 * Notification Service Interface.
 */
public interface NotificationService {

    String notify(NotificationSendRequestDTO notificationSendRequestDTO);
}
