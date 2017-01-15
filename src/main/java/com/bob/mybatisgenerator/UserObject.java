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
public class UserObject {

    private String path;
    private String name;

    public UserObject() {
    }

    public UserObject(String path, String name) {
        this.path = path;
        this.name = name;
    }

    /**
     * 路径
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * 路径
     *
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 名称
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name; 
    }

}
