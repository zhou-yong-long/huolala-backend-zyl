package com.huolala.backend.model;

import lombok.Data;

import java.util.List;

/**
 * @author wade
 * @date 2023/7/23
 */
@Data
public class OrdersRequest {
    private List<String> origin;
    private List<String> destination;
}
