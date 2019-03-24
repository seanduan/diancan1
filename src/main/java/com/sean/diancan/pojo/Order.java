package com.sean.diancan.pojo;

import lombok.Data;

@Data
public class Order {
    private int orderno;
    private int customerno;
    private int orderdate;
    private String ordertype;
    private String status;
    private String creattime;
}
