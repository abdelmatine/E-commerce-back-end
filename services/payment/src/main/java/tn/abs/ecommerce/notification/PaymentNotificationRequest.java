package tn.abs.ecommerce.notification;

import java.math.BigDecimal;

import tn.abs.ecommerce.payment.PaymentMethod;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstname,
        String customerLastname,
        String customerEmail
) {
}
