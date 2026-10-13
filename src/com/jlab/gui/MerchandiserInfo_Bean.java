/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlab.gui;

/**
 *
 * @author Jewel
 */
public class MerchandiserInfo_Bean {

    private String Id;
    private String name;
    private String phone;

    public MerchandiserInfo_Bean() {
    }

    public MerchandiserInfo_Bean(String Id, String name, String phone) {
        this.Id = Id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
