# Observer Pattern

## Behavioral Patter

### Goal :

An observer pattern defines a mechanism to notify multiple objects
about any events that happen to the object they're observing

### Actors

- Subject : Notify all the listeners when an event happens
- Listener: subscribes to the subject for a change in event

### Case Study

Imaging you have an ecommerce with a payment manages that manages payments and also when
payment is successful it needs to tell an event logger to log the payment details
whiles also alerting a notification manager to notify customers of these payments

- PaymentManager --> subject
- PaymentEventLogger --> Listener
- NotificationManager --> Listener

### Solution

With an observe pattern, you can easily decouple this object responsibilites by creating a
subject and listeners

![UML DIAGRAM FOR OBSERVER PATTER](https://refactoring.guru/images/patterns/diagrams/observer/example-2x.png?id=e2838e1562325e485fc7c2828a8ca445)