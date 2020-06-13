/**
 * @description 
 * @author jhl
 * @create Sep 15, 201811:11:32 AM
 */
package com.jhl.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * @description 
 * @author jhl
 * @create Sep 15, 201811:11:32 AM
 */
@Getter
@Setter
public class Car {
    private String brand ;
    private String color;
    private String speed;
    private Date productDate;
}
