import Entity.Bank;
import Entity.Date;
import Entity.Person;
import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;
import repository.BankRepository;
import service.BankService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.concurrent.TimeUnit;

public class Testing {
    public static void main(String[] args) throws ParseException {
        Person person = new Person("majid");
        person.borrow("disk",new Date(1401,1,9));
        Bank bank = new Bank(person);
        BankService bankService = new BankService();
        bankService.add(bank);


    }
}
