package com.thegeekyasian.designpatterns.strategies;

import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service(NotificationType.EMAIL)
public class EmailNotificationService implements NotificationService {

  @Override
  public void sendNotification() {
    System.out.println("Sending email");
  }
}
