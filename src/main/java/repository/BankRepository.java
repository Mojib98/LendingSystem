package repository;

import Entity.Bank;
import org.hibernate.SessionFactory;

public class BankRepository {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public void add(Bank bank){
        var session=sessionFactory.getCurrentSession();
        session.save(bank);

    }
}
