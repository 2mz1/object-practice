package com.object.practice.api.notification.model;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

/**
 * AWS Notification.
 */
@Service(value = NotificationBeanNameConstant.AWS_NOTIFICATION_SERVICE)
public class AwsNotification implements Notification {

    @Override
    public String send(String message) {
        return "AWS PUSH 알림 전송에 성공 했습니다.";
    }
}
