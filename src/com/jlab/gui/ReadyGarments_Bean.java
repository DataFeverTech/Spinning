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
public class ReadyGarments_Bean {

    private String Id;
    private String name;
    private String head;

    public ReadyGarments_Bean() {
    }

    public ReadyGarments_Bean(String Id, String name, String head) {
        this.Id = Id;
        this.name = name;
        this.head = head;
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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    
}
