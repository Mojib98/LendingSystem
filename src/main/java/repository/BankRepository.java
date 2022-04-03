package repository;

import Entity.Bank;
import org.hibernate.SessionFactory;

public class BankRepository {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public void add(Bank bank) {
        var session = sessionFactory.getCurrentSession();
        session.save(bank);
    }

    public Bank findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        Bank bank = session.find(Bank.class, id);
        return bank;
    }
}
