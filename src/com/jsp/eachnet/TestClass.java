package com.jsp.eachnet;

import com.jsp.eachnet.mapper.RepService;
import org.junit.Test;

public class TestClass {

    @Test
    public void text1(){
        try {
            System.out.println(RepService.priceSum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
