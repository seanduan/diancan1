package com.sean.diancan.dao;

import com.sean.diancan.pojo.Item;
import com.sean.diancan.pojo.Order;
import com.sean.diancan.pojo.TaoCan;
import com.sean.diancan.pojo.TaoCanItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * 根据时间获取所有订单
     * @return
     */
    public List<Order> getAllOrderByDate(String date);

    /**
     * 根据客户号码获取所有订单
     * @return
     */
    public List<Order> getAllOrderByCustomerNo(int customerNo);

    /**
     * 获取客户号码特定日期所有订单
     * @return
     */
    public List<Order> getAllOrderByCustomerNoAndDate(String date,int customerNo);

    /**
     * 添加订单
     * @param order
     * @return
     */
    public void addOrder(Order order);

    /**
     * 修改订单状态
     * @param
     */
    public void updateOrder(int orderno,String status);
}
