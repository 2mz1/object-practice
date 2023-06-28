package com.object.practice.api.notification.controller;

import com.object.practice.api.notification.dto.NotificationSendRequestDTO;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(final NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/send")
    public String sendNotification(@RequestBody NotificationSendRequestDTO notificationSendRequestDTO) {
        return notificationService.notify(notificationSendRequestDTO);
//        return notificationServices.get(notificationSendRequestDTO.getProviderName()).sendNotification(notificationSendRequestDTO.message());
    }

}
