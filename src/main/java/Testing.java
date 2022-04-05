import Entity.Bank;
import Entity.Date;
import Entity.DateNotNeed;
import Entity.Person;
import service.BankService;

import java.text.ParseException;

public class Testing {
    public static void main(String[] args) throws ParseException {
        Bank bank = new Bank();
        bank.runner();
        bank.show();
     /*  int s= Date.numDay(new Date(90,12,27),new Date(91,1,1));
        System.out.println(s);*/
    }
}
