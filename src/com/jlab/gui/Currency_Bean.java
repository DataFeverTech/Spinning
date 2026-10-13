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
public class Currency_Bean {

    private String currId;
    private String currName;
    private String realized;
    private String btbAdj;
    private String billPur;
    private String exeSales;
    private String transfer;

    public Currency_Bean() {
    }

    public Currency_Bean(String currId, String currName, String realized, String btbAdj, String billPur, String exeSales, String transfer) {
        this.currId = currId;
        this.currName = currName;
        this.realized = realized;
        this.btbAdj = btbAdj;
        this.billPur = billPur;
        this.exeSales = exeSales;
        this.transfer = transfer;
    }

    public String getCurrId() {
        return currId;
    }

    public void setCurrId(String currId) {
        this.currId = currId;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName;
    }

    public String getRealized() {
        return realized;
    }

    public void setRealized(String realized) {
        this.realized = realized;
    }

    public String getBtbAdj() {
        return btbAdj;
    }

    public void setBtbAdj(String btbAdj) {
        this.btbAdj = btbAdj;
    }

    public String getBillPur() {
        return billPur;
    }

    public void setBillPur(String billPur) {
        this.billPur = billPur;
    }

    public String getExeSales() {
        return exeSales;
    }

    public void setExeSales(String exeSales) {
        this.exeSales = exeSales;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    
    
}
