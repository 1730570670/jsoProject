package com.jsp.eachnet;

import com.jsp.eachnet.mapper.RepService;
import com.jsp.eachnet.pojo.EabyProductCategory;
import org.junit.Test;

import java.util.List;

public class TestClass {

    @Test
    public void text1(){
        try {
            List<EabyProductCategory> list = RepService.queryLevelList(2);
            list.forEach(lists-> System.out.println(lists));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
