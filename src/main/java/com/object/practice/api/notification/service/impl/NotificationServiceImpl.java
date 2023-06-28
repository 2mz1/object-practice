package com.object.practice.api.notification.service.impl;

import com.object.practice.api.notification.dto.NotificationSendRequestDTO;
import com.object.practice.api.notification.model.Notification;
import com.object.practice.api.notification.provider.NotificationProvider;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * Notification Service.
 */
public class NotificationServiceImpl implements NotificationService {

    private final Map<String, Notification> notificationServices;

    public NotificationServiceImpl(Map<String, Notification> notificationServices) {
        this.notificationServices = notificationServices;
    }

    @Override
    public String notify(final NotificationSendRequestDTO notificationSendRequestDTO) {
        return notificationServices
                .get(NotificationProvider
                        .getIfValid(notificationSendRequestDTO.getProviderName()))
                .send(notificationSendRequestDTO.message());
    }
}
