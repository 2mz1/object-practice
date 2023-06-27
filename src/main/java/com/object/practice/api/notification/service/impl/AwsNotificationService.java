package com.object.practice.api.notification.service.impl;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

@Service(value = NotificationBeanNameConstant.AWS_NOTIFICATION_SERVICE)
public class AwsNotificationService implements NotificationService {

    // .. .private... AWS... dependencies...

    @Override
    public String sendNotification(String message) {
        return "AWS PUSH 알림 전송에 성공 했습니다.";
    }
}
