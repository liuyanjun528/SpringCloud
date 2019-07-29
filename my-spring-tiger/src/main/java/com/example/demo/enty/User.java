package com.example.demo.enty;

import java.io.Serializable;

/**
 * <p> 
 *  user
 * </p> 
 * 
 * @author 刘彦军 2019-06-26 14:49:28 137
 */
public class User implements Serializable {
    /**
     * id 描述:
     */
    private Integer id;

    /**
     * name 描述:
     */
    private String name;

    /**
     * sex 描述:
     */
    private String sex;

    /**
     * age 描述:
     */
    private Integer age;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty() ) ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = (sex == null || sex.trim().isEmpty() ) ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}