package com.sean.diancan.dao;

import com.sean.diancan.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDao {
    /**
     * 获取所有单品
     * @return
     */
    public List<Item> getAllItem();

    /**
     * 获取所有套餐
     * @return
     */
    public List<TaoCan> getAllTaoCan();

    /**
     * 获取套餐中所有单品
     * @param taocanno
     * @return
     */
    public List<TaoCanItem> getTaoCanItemByTaoCanNo(int taocanno);

    /**
     * 添加套餐
     * @param taoCan
     */
    public void addTaoCan(TaoCan taoCan);

    /**
     * 添加单品
     * @param item
     */
    public void addItem(Item item);

    /**
     * 添加套餐中单品
     * @param taoCanItem
     */
    public void addTaoCanItem(TaoCanItem taoCanItem);

    /**
     * 删除套餐中单品
     * @param taoCanItem
     */
    public void delCanItem(TaoCanItem taoCanItem);

    /**
     *修改套餐中单品
     * @param taoCanItem
     */
    public void updateCanItem(TaoCanItem taoCanItem);
}
