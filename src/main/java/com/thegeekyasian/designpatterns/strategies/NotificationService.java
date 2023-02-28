package com.thegeekyasian.designpatterns.strategies;

/**
 * The NotificationService interface defines the contract
 * for strategies that provide notification services.
 * Notification services can send notifications
 * and provide the type of notifications that they can send.
 *
 * @author thegeekyasian
 */
public interface NotificationService {

  /**
   * Sends a notification.
   * It can be customized and have parameters as input,
   * can also be modified to have a return type.
   */
  void sendNotification();
}
