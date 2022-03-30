package service;

import Entity.Bank;
import org.hibernate.SessionFactory;
import repository.BankRepository;
import repository.SessionFactorySingleton;

public class BankService {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    BankRepository bankRepository = new BankRepository();
    public void add(Bank bank){
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                bankRepository.add(bank);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }

}
