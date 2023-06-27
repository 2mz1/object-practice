package com.object.practice.api.notification.controller;

import com.object.practice.api.notification.dto.NotificationSendRequestDTO;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NotificationController {

    private final Map<String, NotificationService> notificationServices;

    public NotificationController(Map<String, NotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    @PostMapping("/send")
    public String sendNotification(@RequestBody NotificationSendRequestDTO notificationSendRequestDTO) {
        return notificationServices.get(notificationSendRequestDTO.getProviderName()).sendNotification(notificationSendRequestDTO.message());
    }

}
