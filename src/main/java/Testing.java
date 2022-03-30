import Entity.Date;
import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.concurrent.TimeUnit;

public class Testing {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(1401,1,2);
        Date date2 = new Date(1401,1,4);
        System.out.println(date.getGregorianCalendar());
//        Period diff = Period.between(date.getGregorianCalendar(),date2.getGregorianCalendar());
//        long diffInDays = ChronoUnit.DAYS.between( date.getGregorianCalendar(), date2.getGregorianCalendar());
        System.out.println(date.getGregorianCalendar());
        System.out.println(date2.getGregorianCalendar());
        long diffInMillies = Math.abs(date2.getGregorianCalendar().getTime() - date.getGregorianCalendar().getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        System.out.println(diff);

    }
}
