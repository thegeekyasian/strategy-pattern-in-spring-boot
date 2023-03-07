# Strategy Design Pattern in Spring Boot

[![Discord](https://img.shields.io/badge/discord-design_patterns-purple)](https://discord.gg/kNhgfK8pNg)
[![Twitter](https://img.shields.io/badge/twitter-thegeekyasian-9cf)](https://www.twitter.com/thegeekyasian)

Discover the simplest and most effective way to implement strategy patterns in Spring Boot with the provided implementation. 

This project provides clear and concise examples of these powerful design patterns in action, along with detailed explanations that make it easy to understand and apply them to your own Spring Boot projects. 

The project primarily uses Spring Boot dependency injection with autowiring to resolve the created strategies, which enabled you to comply with `O` of SOLID design principles, i.e. Open-Closed Principle.

Which means, to add a new strategy, all you have to do is just have to provide a new implementation of your strategy interface and that's it.
Spring will automatically resolve the dependencies and will map it to the provided type.

## How to run

The application uses Spring Boot and starts on post `9000` by default.
You can simply build and run the project similar to how to run any other spring boot applications.

The application will execute the `test()` method in the `NotificationExecutor`, which calls `NotificationFactory` for each of three supported notification types.
It will produce the below output:

``` java
Sending email
Sending push notification
Sending SMS
```

## How was it done?
To understand further, you can go through a step-by-step guide that I have created on how it was implemented.

The guide is available **[HERE](https://thegeekyasian.com/strategy-pattern-spring-boot/)**.

## Help

For any questions, assistance or to report any issues, please feel free to join the [discord community](https://discord.gg/kNhgfK8pNg).
