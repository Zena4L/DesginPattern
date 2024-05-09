package org.example.behavioral.observer;

public class Notification implements PaymentListener {

    private void sendNotification() {
        System.out.println("Payment notification");
    }

    @Override
    public void paymentMade() {
        sendNotification();
    }
}
