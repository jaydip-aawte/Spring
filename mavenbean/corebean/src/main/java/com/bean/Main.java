package com.bean;

import com.bean.Beans.User;
import com.bean.config.BeanConfig;
import com.bean.config.MultiBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User uobj=new User();//this object is not created in application context IOC container has no idea about this object
        uobj.setName("aakash");
        System.out.println("Value Coming statically from new object: "+uobj.getName());//manual object Creation

        var context=new AnnotationConfigApplicationContext(BeanConfig.class);//single Bean Configuration class
       User beanObject=context.getBean(User.class);
        System.out.println("Object Managed by Spring IOC Container: "+beanObject.getName());

        var context2=new AnnotationConfigApplicationContext(MultiBeanConfig.class);
        //User beanObject2=context2.getBean(User.class);//this bean will get NoUniqueBeanDefination Error as there are
        //multiple beans with no Unique identity
        //commented bean will get NoUniqueBeanDefination Error as there are
        User beanObject2=context2.getBean("user1",User.class);//we can solve it using BeanNameExplictely


        System.out.println(beanObject2.getName()+" @ "+beanObject2.getAddress());

    }
}