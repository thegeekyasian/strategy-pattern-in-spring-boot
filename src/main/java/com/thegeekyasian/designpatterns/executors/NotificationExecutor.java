package com.thegeekyasian.designpatterns.executors;

import com.thegeekyasian.designpatterns.factories.NotificationFactory;
import com.thegeekyasian.designpatterns.strategies.NotificationType;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service
public class NotificationExecutor {
  private final NotificationFactory notificationFactory;

  public NotificationExecutor(NotificationFactory notificationFactory) {
    this.notificationFactory = notificationFactory;
  }

  @PostConstruct
  public void test() {
    notificationFactory.execute(NotificationType.EMAIL); // prints `Sending email`
    notificationFactory.execute(NotificationType.PUSH_NOTIFICATION); // prints `Sending push notification`
    notificationFactory.execute(NotificationType.SMS); // prints `Sending SMS`
  }
}