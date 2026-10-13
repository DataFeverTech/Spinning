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
public class Unit_Bean {
    
    private String unitId;
    private String unit;
  

    public Unit_Bean(String unitId, String unit) {
        this.unitId = unitId;
        this.unit = unit;
       
    }

    public Unit_Bean() {
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



    
    
}
