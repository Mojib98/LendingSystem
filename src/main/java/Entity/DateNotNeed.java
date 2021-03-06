package Entity;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.util.GregorianCalendar;
public class DateNotNeed {
    PersianCalendar persianCalendar;
    GregorianCalendar gregorianCalendar;

    java.util.Date date;
    public DateNotNeed(int year, int month, int day) {
        persianCalendar = new PersianCalendar(year,month,day);
         gregorianCalendar = new GregorianCalendar();
         gregorianCalendar.setTime(persianCalendar.getTime());
        gregorianCalendar.set((gregorianCalendar.get(Calendar.YEAR)),
                gregorianCalendar.get(Calendar.MONTH),gregorianCalendar.get(Calendar.DATE));
        this.date=gregorianCalendar.getTime();
    }

    public java.util.Date Date() {
        return this.date;
    }

    public DateNotNeed() {

    }
}
