package com.object.practice.api.notification.provider;

import com.object.practice.api.notification.constant.NotificationBeanNameConstant;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Notification Provider.
 */
@Getter
@RequiredArgsConstructor
public enum NotificationProvider {
    AOS(NotificationBeanNameConstant.AOS_NOTIFICATION_SERVICE),
    IOS(NotificationBeanNameConstant.IOS_NOTIFICATION_SERVICE),
    AWS(NotificationBeanNameConstant.AWS_NOTIFICATION_SERVICE),
    GOOGLE(NotificationBeanNameConstant.GOOGLE_NOTIFICATION_SERVICE),
    ;

    private final String notificationName;
}
