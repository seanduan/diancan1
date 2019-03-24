package com.sean.diancan.dao;

import com.sean.diancan.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerDao {

    public Customer getUserByName(String name);
}
