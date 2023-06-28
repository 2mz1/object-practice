package com.object.practice.api.notification.model;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

/**
 * Google Notification.
 */
@Service(value = NotificationBeanNameConstant.GOOGLE_NOTIFICATION_SERVICE)
public class GoogleNotification implements Notification {

    @Override
    public String send(String message) {
        return "GOOGLE PUSH 알림 전송에 성공 했습니다.";
    }
}