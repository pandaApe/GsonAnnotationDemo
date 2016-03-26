package com.pandaape.gsonannotationdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Description:
 *
 * @Author: PandaApe.
 * @CreatedAt: 27/3/16 00:23.
 * @Email: whailong2010@gmail.com
 */
public class Car {

    @SerializedName("brandName")
    private String brand;

    private String engineModel;

    @Override
    public String toString() {
        return "brand="+getBrand()+"\nengineModel="+getEngineModel();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }
}
