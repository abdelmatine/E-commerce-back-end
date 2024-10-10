package tn.abs.ecommerce.payment;

import java.math.BigDecimal;

import tn.abs.ecommerce.customer.CustomerResponse;
import tn.abs.ecommerce.order.PaymentMethod;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
