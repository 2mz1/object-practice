package com.object.practice.api.notification.service.impl;

import com.object.practice.api.notification.dto.NotificationSendRequestDTO;
import com.object.practice.api.notification.model.Notification;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Notification Service.
 */
@Service
public class NotificationServiceImpl implements NotificationService {

    private final Map<String, Notification> notificationServices;

    public NotificationServiceImpl(Map<String, Notification> notificationServices) {
        this.notificationServices = notificationServices;
    }

    @Override
    public String notify(final NotificationSendRequestDTO notificationSendRequestDTO) {
        return notificationServices
                .get(notificationSendRequestDTO.getProviderName())
                .send(notificationSendRequestDTO.message());
    }
}
