package com.bean.config;

import com.bean.Beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    User user(){
        var obj=new User();
        obj.setName("jay");
        obj.setAddress("Mumbai");
        return obj;
    }


    @Bean
    String string(){
        return "this is string";
    }
}
