package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager { // this is the subject

    private List<PaymentListener> paymentListeners = new ArrayList<>();


    public void pay() {
        paymentListeners.forEach(PaymentListener::paymentMade);
        System.out.println("Payment made");
    }

    public void registerPaymentListeners(PaymentListener listener) {
        paymentListeners.add(listener);
    }

    public void unregisterPaymentListener(PaymentListener listener) {
        paymentListeners.remove(listener);
    }
}
