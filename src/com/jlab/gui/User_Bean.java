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
public class User_Bean {
    
    
    
     private String userid;
    private String User;
    private String Descri;

    public User_Bean(String userid, String User, String Descri) {
        this.userid = userid;
        this.User = User;
        this.Descri = Descri;
    }

    public User_Bean() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getDescri() {
        return Descri;
    }

    public void setDescri(String Descri) {
        this.Descri = Descri;
    }

    @Override
    public String toString() {
        return "User_Bean{" + "userid=" + userid + ", User=" + User + ", Descri=" + Descri + '}';
    }
   
   
    

}
