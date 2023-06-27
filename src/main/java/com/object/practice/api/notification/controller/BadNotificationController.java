package com.object.practice.api.notification.controller;

import com.object.practice.api.notification.dto.BadNotificationSendRequestDTO;
import com.object.practice.api.notification.service.impl.AosNotificationService;
import com.object.practice.api.notification.service.impl.AwsNotificationService;
import com.object.practice.api.notification.service.impl.GoogleNotificationService;
import com.object.practice.api.notification.service.impl.IosNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class BadNotificationController {

    private final GoogleNotificationService googleNotificationService;
    private final AosNotificationService aosNotificationService;
    private final IosNotificationService iosNotificationService;
    private final AwsNotificationService awsNotificationService;

    @PostMapping("bad-send")
    public String badSendNotification(@RequestBody BadNotificationSendRequestDTO badNotificationSendRequestDTO) {
        if (badNotificationSendRequestDTO.notificationProvider().equals("GOOGLE")) {
            return googleNotificationService.sendNotification(badNotificationSendRequestDTO.message());
        } else if (badNotificationSendRequestDTO.notificationProvider().equals("IOS")) {
            return iosNotificationService.sendNotification(badNotificationSendRequestDTO.message());
        } else if (badNotificationSendRequestDTO.notificationProvider().equals("AWS")) {
            return awsNotificationService.sendNotification(badNotificationSendRequestDTO.message());
        } else if (badNotificationSendRequestDTO.notificationProvider().equals("AOS")) {
            return awsNotificationService.sendNotification(badNotificationSendRequestDTO.message());
        } else {
            throw new IllegalArgumentException("잘못된 NotificationProvider 입니다.");
        }
    }

}
