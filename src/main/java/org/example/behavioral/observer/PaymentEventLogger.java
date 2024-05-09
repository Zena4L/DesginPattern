package org.example.behavioral.observer;

public class PaymentEventLogger implements PaymentListener {

    private void log() {
        System.out.println("logging payment");
    }

    @Override
    public void paymentMade() {
        log();
    }
}
