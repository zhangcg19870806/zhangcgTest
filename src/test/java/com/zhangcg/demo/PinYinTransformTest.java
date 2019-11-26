package com.zhangcg.demo;

import com.zhangcg.demo.utils.PinYinTransformUtil;

public class PinYinTransformTest {

    public static void main(String args[]){
        String supplier1 = "中国铁路北京局集团有限公司财务部(本级)";
        PinYinTransformUtil pinYinTransformUtil = new PinYinTransformUtil();
        System.out.println(pinYinTransformUtil.getFirstSpell(supplier1));

    }

}
