/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bob.mybatisgenerator;

/**
 *
 * @author dobob
 */
public class BeanInfo {

    /**
     * domain对象属性
     */
    private String filed;
    /**
     * domain对象属性备注
     */
    private String comment;
    /**
     * domain对象属性类型
     */
    private String type;

    /**
     * domain对象属性
     */
    public String getFiled() {
        return filed;
    }

    /**
     * domain对象属性
     */
    public void setFiled(String filed) {
        this.filed = filed;
    }

    /**
     * domain对象属性备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * domain对象属性备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * domain对象属性类型
     */
    public String getType() {
        return type;
    }

    /**
     * domain对象属性类型
     */
    public void setType(String type) {
        this.type = type;
    }
}
