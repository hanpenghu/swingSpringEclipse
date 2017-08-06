package com.hanhan.swingSpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hanhan.swingSpringTest.swing.TestSwing;
import com.hanhan.swingSpringTest.utils.SpringUtil;

public class Start {

	public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
//        SpringUtil.getBean(TestSwing.class);
    }
}
