package com.itheima.dao;

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
public interface ItemsDao {


    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
