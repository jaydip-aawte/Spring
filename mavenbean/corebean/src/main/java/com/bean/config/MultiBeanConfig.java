package com.bean.config;

import com.bean.Beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MultiBeanConfig {

    @Bean
    User user1(){
        var uobj=new User();
        uobj.setName("UgraSen");
        uobj.setAddress("Mumbai");
        return uobj;
    }
    @Bean
    User user2(){
        var uobj=new User();
        uobj.setName("UgraSen1");
        uobj.setAddress("Mumbai");
        return uobj;
    }
    @Primary
    @Bean
    User user3(){
        var uobj=new User();
        uobj.setName("Primay Bean");
        uobj.setAddress("Mumbai");
        return uobj;
    }
}
