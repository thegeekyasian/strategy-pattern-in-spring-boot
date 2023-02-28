package com.thegeekyasian.designpatterns.factories;

import com.thegeekyasian.designpatterns.strategies.NotificationService;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * A factory class for creating instances of
 * NotificationService based on a provided notification type.
 *
 * @author thegeekyasian
 */
@Component
public class NotificationFactory {

  /**
   * A map that contains NotificationService instances
   * mapped to their corresponding notification types.
   */
  private final Map<String, NotificationService> notificationServiceMap;

  /**
   * Uses constructor-autowiring to create a new NotificationFactory instance
   * with the provided map of NotificationService instances.
   *
   * @param notificationServices a map of NotificationService instances
   */
  public NotificationFactory(Map<String, NotificationService> notificationServices) {
    this.notificationServiceMap = notificationServices;
  }

  /**
   * Returns the NotificationService instance
   * corresponding to the provided notification type.
   *
   * @param notificationType the type of notification
   * @return the NotificationService instance corresponding to the provided notification type
   * @throws RuntimeException if the provided notification type is not supported
   */
  public NotificationService getNotificationService(String notificationType) {
    NotificationService notificationService = notificationServiceMap.get(notificationType);
    if (notificationService == null) {
      throw new RuntimeException("Unsupported notification type");
    }

    return notificationService;
  }

  /**
   * Executes the sendNotification() method on the NotificationService
   * instance corresponding to the provided notification type.
   * @param notificationType the type of notification to execute
   * @throws RuntimeException if the provided notification type is not supported
   */
  public void execute(String notificationType) {
    NotificationService notificationService = getNotificationService(notificationType);
    notificationService.sendNotification();
  }
}
