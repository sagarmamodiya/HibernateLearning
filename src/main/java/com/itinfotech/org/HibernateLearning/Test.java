package com.itinfotech.org.HibernateLearning;



import java.util.Date;
 
import org.hibernate.Session;
 
public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        User user = new User();
 
        user.setUserId(1);
        user.setUsername("Mukesh");
        user.setCreatedBy("Google");
        //new Date() will initialize with current date.
        user.setCreatedDate(new Date());
 
        session.save(user);
        session.getTransaction().commit();
 
    }
 
}
