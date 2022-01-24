package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao{
    @Autowired
    private SessionFactory sessionFactory;

    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

}
