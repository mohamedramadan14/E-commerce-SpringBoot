package com.mo.purely.dtos.responses;

import com.mo.purely.modals.CartItem;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class CartResponseDto {

    private String cartId;
    private Set<CartItem> cartItems;
    private int noOfCartItems;
    private double subtotal;

}
