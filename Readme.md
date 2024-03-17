# Fundamentals
**What is the difference between Spring and Spring Boot?**

**Spring** is a lightweight framework, providing support for dependency injection, AOP, transaction management and many more features. Its core functionality is the Spring container, which is an implementation of the Inversion of Control design pattern that decouples business logic and configuration.

**Inversion of control - IoC** In traditional programming, the application code determines the control flow. With IoC, the framework controls the flow, and the application code is called by the framework when appropriate.

The application code does not need to instantiate its dependencies. Instead, the Spring container will manage the creation and configuration of these objects (known as beans) and inject them into the applicaiton code when they are needed. This achieves decoupling, and allows for more flexible and modular code, as dependencies can be easily swapped or configured differently without changing application logic.

**Spring Boot** is built on top of the Spring Framework and it enables developers to quickly build enterprise Java applications. As it comes built-in with default configurations, auto-configuration feature, an embedded servlet container and other production-ready features, it greatly reduces the amount of boilerplate code.

In summary, **Spring Framework** provides a powerful and flexible framework for building Java applications and **Spring Boot** builds on top of it to simplify and streamline the development process.
