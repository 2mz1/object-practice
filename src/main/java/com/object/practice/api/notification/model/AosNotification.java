package com.object.practice.api.notification.model;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

/**
 * AOS Notification.
 */
@Service(value = NotificationBeanNameConstant.AOS_NOTIFICATION_SERVICE)
public class AosNotification implements Notification {

    @Override
    public String send(String message) {
        return "AOS PUSH 알림 전송에 성공 했습니다.";
    }
}
