package com.example.soumik.hibernate;

import org.springframework.context.ApplicationContext;
import model.Point;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.PointDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCntxt = new ClassPathXmlApplicationContext("Beans.xml");
        PointDaoImpl h = appCntxt.getBean("pointDaoImpl", PointDaoImpl.class);
        Point demoPoint=new Point(2,3,4);
        h.insertPoint(demoPoint);
        System.out.println(h.getPointCount());

    }
}
