package com.bean.config;

import com.bean.Beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NamingBeans {
    @Bean(value = "Bean1")
    User user(){
        var obj=new User();
        obj.setName("Bean1");
        obj.setAddress("NamingBeans");
        return obj;
    }

    @Bean(name = "Bean2")
    User user1(){
        var obj=new User();
        obj.setName("Bean3");
        obj.setAddress("NamingBeans");
        return obj;
    }

    @Bean("Bean3")
    User user2(){
        var obj=new User();
        obj.setName("Bean3");
        obj.setAddress("NamingBeans");
        return obj;
    }
}
