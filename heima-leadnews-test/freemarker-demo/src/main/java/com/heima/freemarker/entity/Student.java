package com.heima.freemarker.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private String name;
    private int age;
    private Date brithday;
    private Float money;
}
