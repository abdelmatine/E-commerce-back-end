package tn.abs.ecommerce.kafka;

import java.math.BigDecimal;
import java.util.List;

import tn.abs.ecommerce.customer.CustomerResponse;
import tn.abs.ecommerce.order.PaymentMethod;
import tn.abs.ecommerce.product.PurchaseResponse;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
