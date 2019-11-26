package com.zhangcg.demo.utils;

import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.cfg.DefaultConfig;
import org.wltea.analyzer.dic.Dictionary;

import java.util.HashSet;

public class DicUtil {
    public static void extendDic(){

        Configuration cfg=DefaultConfig.getInstance();
        System.out.println(cfg.getMainDictionary());
        Dictionary.initial(cfg);
        Dictionary dic=Dictionary.getSingleton();
        HashSet<String> set=new HashSet<>();
        set.add("星际屌丝");
        set.add("张晨光的mac");

        dic.addWords(set);

    }
}
