package com.object.practice.api.notification.service.impl;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

@Service(value = NotificationBeanNameConstant.GOOGLE_NOTIFICATION_SERVICE)
public class GoogleNotificationService implements NotificationService {

    // .. .private... GOOGLE... dependencies...

    @Override
    public String sendNotification(String message) {
        return "GOOGLE PUSH 알림 전송에 성공 했습니다.";
    }
}