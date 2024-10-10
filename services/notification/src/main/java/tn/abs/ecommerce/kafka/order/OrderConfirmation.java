package tn.abs.ecommerce.kafka.order;

import java.math.BigDecimal;
import java.util.List;

import tn.abs.ecommerce.kafka.payment.PaymentMethod;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products

) {
}