package com.ba.smstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 자동 설정 - 위치부터 설정을 읽기때문에 최상단에 위치
public class Application {
    public static void main(String[] args){
//      내장 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
