package com.mo.orderservice.modals;

import com.mo.orderservice.dtos.CartItemDto;
import com.mo.orderservice.enums.EOrderPaymentStatus;
import com.mo.orderservice.enums.EOrderStatus;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    private String userId;

    private String firstName;

    private String lastName;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String phoneNo;

    private double orderAmt;

    private LocalDateTime placedOn;

    private EOrderStatus orderStatus;

    private EOrderPaymentStatus paymentStatus;

    private Set<CartItemDto> orderItems;

}
