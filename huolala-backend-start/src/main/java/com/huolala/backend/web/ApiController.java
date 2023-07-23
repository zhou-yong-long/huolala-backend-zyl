package com.huolala.backend.web;

import cn.hutool.core.collection.CollectionUtil;
import com.huolala.backend.model.BasicRespond;
import com.huolala.backend.model.OrdersRequest;
import com.huolala.backend.model.PageRespond;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

/**
 * @author wade
 * @date 2023/7/23
 */
@RestController
public class ApiController {

    @RequestMapping(method = RequestMethod.POST, path = "/orders")
    public Object orders(@RequestBody OrdersRequest request) {
        if (CollectionUtil.isEmpty(request.getDestination()) || CollectionUtil.isEmpty(request.getOrigin())) {
            return BasicRespond.getError();
        }

        return BasicRespond.getOrdersSuccess(new ArrayList<>());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/orders/{id}")
    public Object updateOrder(@PathVariable(name = "id") Long id) {
        System.out.println(id);

        return BasicRespond.getOrdersSuccess(new ArrayList<>());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/orders")
    public Object listOrders(@RequestParam Integer pageNo, @RequestParam Integer limit) {
        if (pageNo == null || pageNo == 0 || limit == null) {
            return BasicRespond.getError();
        }

        return PageRespond.listOrdersSuccess(new ArrayList<>(), 0);
    }
}
