package com.object.practice.api.notification.model;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

/**
 * IOS Notification.
 */
@Service(value = NotificationBeanNameConstant.IOS_NOTIFICATION_SERVICE)
public class IosNotification implements Notification {

    @Override
    public String send(String message) {
        return "IOS PUSH 알림 전송에 성공 했습니다.";
    }
}
