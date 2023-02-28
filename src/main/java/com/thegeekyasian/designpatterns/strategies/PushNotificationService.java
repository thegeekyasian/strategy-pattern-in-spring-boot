package com.thegeekyasian.designpatterns.strategies;

import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service(NotificationType.PUSH_NOTIFICATION)
public class PushNotificationService implements NotificationService {

  @Override
  public void sendNotification() {
    System.out.println("Sending push notification");
  }
}
