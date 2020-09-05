package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class PointDaoImpl {

    private SessionFactory sessionFactory;


    public List<Point> getPointCount(){
        String hql = "from Point";
        Query query = sessionFactory.openSession().createQuery(hql);
        System.out.println(query.list());
        return ((List<Point>) query.list());
    }
    public List<Point> getPoint(){
        String hql = "from Point";
        Query query = sessionFactory.openSession().createQuery(hql);
        //System.out.println(query.list());
        return ((List<Point>) query.list());
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void insertPoint(Point point)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(point);
        session.getTransaction().commit();
    }

}