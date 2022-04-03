package service;

import Entity.Bank;
import org.hibernate.SessionFactory;
import repository.BankRepository;
import repository.SessionFactorySingleton;

public class BankService {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    private final BankRepository bankRepository = new BankRepository();

    public void add(Bank bank) {
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


    public Bank findById(Integer id) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                return bankRepository.findById(id);
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
                return null;
            }

        }

    }

}
