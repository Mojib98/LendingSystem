package service;

import org.hibernate.SessionFactory;
import repository.SessionFactorySingleton;

public class DiskService implements DiskInter{
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public Boolean isAvailable(String name){
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();

                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return false;
    }
    @Override
    public void insert(String name){
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();

                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }

    }
    @Override
    public void update(String name,Boolean condition){
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();

                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }
}
