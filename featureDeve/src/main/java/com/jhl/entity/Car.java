/**
 * @description 
 * @author jhl
 * @create Sep 15, 201811:11:32 AM
 */
package com.jhl.entity;

import java.util.Date;


/**
 * @description 
 * @author jhl
 * @create Sep 15, 201811:11:32 AM
 */
public class Car {
    private String brand ;
    private String color;
    private String speed;
    private Date productDate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }
}
