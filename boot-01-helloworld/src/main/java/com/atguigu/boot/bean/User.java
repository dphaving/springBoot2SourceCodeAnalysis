package com.atguigu.boot.bean;

import lombok.*;

/**
 * 用户
 */

//@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public User() {
        System.out.println("调用了User无参数构造器！");
    }

}
