package com.bdqn.demo14.utils;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Sanginfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String,String> info = new HashMap<String,String>();
        info.put("name","小任");
        info.put("email","596938857@qq.com");
        builder.withDetail("author",info);
    }
}
