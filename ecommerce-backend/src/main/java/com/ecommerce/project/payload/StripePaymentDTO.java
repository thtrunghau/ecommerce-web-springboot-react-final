package com.ecommerce.project.payload;

import com.ecommerce.project.models.Address;
import lombok.Data;

import java.util.Map;

@Data
public class StripePaymentDTO {
    private String currency;
    private Long amount;
    private String email;
    private String name;
    private Address address;
    private String description;
    private Map<String, String> metadata;
}
