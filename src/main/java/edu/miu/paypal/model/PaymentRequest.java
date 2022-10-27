package edu.miu.paypal.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private double price;
    private String accountNumber;
}