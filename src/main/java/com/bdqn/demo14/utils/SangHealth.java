package com.bdqn.demo14.utils;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class SangHealth implements HealthIndicator {
    @Override
    public Health health() {
        return Health.status("FATAL").withDetail("msg","网络断开...").build();
    }


    //    @Override
//    public Health health() {
//        if(checkNetwork()){
//            return Health.up().withDetail("msg","网络连接正常...").build();
//        }
//        return Health.up().withDetail("msg","网络断开...").build();
//    }
//
//    boolean checkNetwork(){
//        boolean connect = false;
//        Runtime runtime = Runtime.getRuntime();
//        Process process;
//        InputStreamReader isr = new InputStreamReader(is,"GBK");
//        try {
//            process = runtime.exec("ping " + "www.baidu.com");
//            InputStream is = process.getInputStream();
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(isr);
//            String line = null;
//            StringBuffer sb = new StringBuffer();
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//            }
//            System.out.println("返回值为:"+sb.toString());
//            is.close();
//            isr.close();
//            br.close();
//
//            if (null != sb && !sb.toString().equals("")) {
//                String logString = "";
//                if (sb.toString().indexOf("TTL") > 0) {
//                    // 网络畅通
//                    connect = true;
//                } else {
//                    // 网络不畅通
//                    connect = false;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return connect;
//    }


}
