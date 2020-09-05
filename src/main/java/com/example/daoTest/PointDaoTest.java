package com.example.daoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Point;
import model.PointDaoImpl;


public class PointDaoTest {
    PointDaoImpl pointDao;
    @Before
    public void beforeEachTest() {
    	ApplicationContext appCntxt = new ClassPathXmlApplicationContext("Beans.xml");
        pointDao = appCntxt.getBean("pointDaoImpl", PointDaoImpl.class);
        pointDao.insertPoint(new Point(11,22,33));
    }

    @Test
    public void retrieveAllRecords() {
        int actualResult = pointDao.getPoint().size();
        int expectedResult = 1;
        //Assertions.assertEquals(actualResult, expectedResult);
        assertEquals(actualResult,expectedResult);
        
    }
}
