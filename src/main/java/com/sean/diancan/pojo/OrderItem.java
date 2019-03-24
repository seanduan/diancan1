package com.sean.diancan.pojo;

import lombok.Data;

@Data
public class OrderItem {
    private int orderno;
    private String menuitemtype;
    private String menuitemno;
    private int menuitemsize;
}
