package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2021/2/3
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    /**
     * 查询所有
     */
    @RequestMapping("/list")
    public String findAll(Model model, HttpServletRequest req){
        // 调用业务查询所有
        // 调用业务查询所有
        List<Items> list = itemsService.findAll();
        // 塞给页面 key = value
        model.addAttribute("items",list);
        System.out.println("我是老大....")
        return "items";
    }

    /**
     * 添加
     */
    @RequestMapping("/save")
    public String save(Items items){
        // 调用业务保存
        // 调用业务保存
        itemsService.save(items);
        // 返回controller的list查询
        return "redirect:/items/list";
    }
}
