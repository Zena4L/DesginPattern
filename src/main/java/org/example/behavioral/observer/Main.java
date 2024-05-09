package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {


        PaymentManager paymentManager = new PaymentManager();

        PaymentListener notification = new Notification();
        paymentManager.registerPaymentListeners(notification);

        PaymentListener logger = new PaymentEventLogger();
        paymentManager.registerPaymentListeners(logger);

        paymentManager.pay();
    }

}
