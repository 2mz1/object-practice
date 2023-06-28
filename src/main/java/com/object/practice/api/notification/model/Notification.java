package com.object.practice.api.notification.model;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import com.object.practice.api.notification.service.NotificationService;
import org.springframework.stereotype.Service;

/**
 * Notification Interface.
 */
public interface Notification {
    String send(String message);
}
