package com.example.demo.enty;

import java.io.Serializable;

/**
 * <p> 
 *  stu
 * </p> 
 * 
 * @author 刘彦军 2019-06-26 14:48:39 714
 */
public class Stu implements Serializable {
    /**
     * id 描述:
     */
    private Integer id;

    /**
     * stuname 描述:
     */
    private String stuname;

    /**
     * stusex 描述:
     */
    private String stusex;

    /**
     * stuage 描述:
     */
    private String stuage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = (stuname == null || stuname.trim().isEmpty() ) ? null : stuname.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = (stusex == null || stusex.trim().isEmpty() ) ? null : stusex.trim();
    }

    public String getStuage() {
        return stuage;
    }

    public void setStuage(String stuage) {
        this.stuage = (stuage == null || stuage.trim().isEmpty() ) ? null : stuage.trim();
    }
}