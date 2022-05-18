package com.jsp.eachnet;

import com.jsp.eachnet.mapper.MangerService;
import com.jsp.eachnet.mapper.RepService;
import com.jsp.eachnet.pojo.EabyNews;
import com.jsp.eachnet.pojo.EabyOrder;
import com.jsp.eachnet.pojo.EabyProduct;
import org.junit.Test;
import org.junit.runner.Request;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.*;

/**
 * @Author: Java小胡
 *
 * 测试类
 */
public class TestClass {

    @Test
    public void test1(){
        try {
            List<EabyOrder> list = MangerService.searchOrderList();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
