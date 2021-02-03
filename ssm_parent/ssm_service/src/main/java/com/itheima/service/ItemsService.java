package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2021/2/3
 */
public interface ItemsService {

    List<Items> findAll();

    void save(Items items);
}
