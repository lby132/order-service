package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder    // 생성자를 생성해서 setter메서드로 변경하는것보다 훨씬 직관적이다.
public class Payload {
    private String order_id;
    private String user_id;
    private String product_id;
    private int qty;
    private int unit_Price;
    private int total_Price;
}
