package com.example.demo.enty;

import java.io.Serializable;

/**
 * <p> 
 *  cod
 * </p> 
 * 
 * @author 刘彦军 2019-06-28 09:55:45 771
 */
public class Cod implements Serializable {
    /**
     * codeid 描述:
     */
    private Integer codeid;

    /**
     * codename 描述:
     */
    private String codename;

    private static final long serialVersionUID = 1L;

    public Integer getCodeid() {
        return codeid;
    }

    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = (codename == null || codename.trim().isEmpty() ) ? null : codename.trim();
    }
}