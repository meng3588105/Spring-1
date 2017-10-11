package com.xdf;

import com.xdf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {


    //前置通知测试
    @Test
    public    void   testBefore(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service= (UserService) context.getBean("userProxy");
        service.eat();
        System.out.println("*************");
        service.sleep();

    }
}
