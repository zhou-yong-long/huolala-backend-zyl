package com.huolala.backend.model;

import lombok.Data;

/**
 * @author wade
 * @date 2023/7/23
 */
@Data
public class OrderItem {
    private Long id;
    private Integer distance;
    private String status;
}
