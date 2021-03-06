package com.taotao.portal.controller;

import com.taotao.pojo.TbUser;
import com.taotao.portal.pojo.Order;
import com.taotao.portal.service.OrderService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/16 0016.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/create")
    public String createOrder(Order order, Model model, HttpServletRequest request) {
        try {
            //从Request中取用户信息
            TbUser user = (TbUser) request.getAttribute("user");
            //在order对象中补全用户信息
            order.setUserId(user.getId());
            order.setBuyerNick(user.getUsername());
            //调用服务
            String orderId = orderService.createOrder(order);
            model.addAttribute("orderId", orderId);
            model.addAttribute("payment", order.getPayment());
            model.addAttribute("date", new DateTime().plusDays(3).toString("yyyy-MM-dd"));
            return "success";

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "创建订单出错。请稍后重试！");
            return "error/exception";
        }
    }
}
