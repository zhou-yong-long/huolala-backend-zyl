package com.huolala.backend.model;


import lombok.Data;

import java.util.List;

/**
 * @author wade
 * @date 2023/7/23
 */
@Data
public class BasicRespond {
    private String code;
    private String errors;
    private Object data;

    public BasicRespond() {
    }

    public BasicRespond (String code, String errors, Object data) {
        this.code = code;
        this.errors = errors;
        this.data = data;
    }

    public static BasicRespond getError() {
        return new BasicRespond("400", "ERROR_DESCRIPTION", null);
    }

    public static BasicRespond getOrdersSuccess(List<OrderItem> res) {
        return new BasicRespond("200", null, res);
    }

    public static BasicRespond getUpdateOrdersSuccess(String status) {
        return new BasicRespond("200", null, status);
    }
}
