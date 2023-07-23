package com.huolala.backend.model;

import lombok.Data;

import java.util.List;

/**
 * @author wade
 * @date 2023/7/23
 */
@Data
public class PageRespond extends BasicRespond{

    private Integer total;

    public PageRespond(String code, Object data, Integer total) {
        super(code, null, data);
        this.total = total;
    }

    public static PageRespond listOrdersSuccess(List<OrderItem> res, Integer total) {
        return new PageRespond("200", res, total);
    }
}
