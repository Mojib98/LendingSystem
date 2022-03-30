package Entity;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.util.GregorianCalendar;
@Embeddable
public class Date {
    @Transient
    PersianCalendar persianCalendar;
    @Transient
    GregorianCalendar gregorianCalendar;

    java.util.Date date;
    public Date(int year, int month, int day) {
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

    public Date() {

    }
}
