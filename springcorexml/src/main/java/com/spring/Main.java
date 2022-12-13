package com.spring;
import com.spring.beans.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
      var context=new ClassPathXmlApplicationContext("UserConfig.xml");
      User obj=context.getBean(User.class);
      //this time we are providing data through xml config file without any annotations
        //this is old way to provide meta data to spring ioc container to handel objects and instatiate classes
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());
    }
}