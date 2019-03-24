package com.sean.diancan.services;

import com.sean.diancan.dao.CustomerDao;
import com.sean.diancan.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServices {
    @Autowired
    private CustomerDao customerDao;
    public Customer getCutomerbyName(String name){
        return customerDao.getUserByName(name);
    }
}
