package com.example.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by wzy on 2017/2/13.
 */
@Data
public class Person implements Serializable{
    private static final long serialVersionUID = -2142457416898347013L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String address;
    public Person() {
        super();
    }
    public Person(Long id, String name, Integer age,String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
