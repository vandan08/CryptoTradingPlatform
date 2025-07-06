package com.vs.request;

import com.vs.domain.OrderType;
import lombok.Data;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
