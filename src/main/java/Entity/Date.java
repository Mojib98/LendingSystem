package Entity;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.util.GregorianCalendar;

public class Date {


    PersianCalendar persianCalendar;

    GregorianCalendar gregorianCalendar;
    public Date(int year, int month, int day) {
        persianCalendar = new PersianCalendar(year,month,day);
         gregorianCalendar = new GregorianCalendar();
         gregorianCalendar.setTime(persianCalendar.getTime());
        gregorianCalendar.set((gregorianCalendar.get(Calendar.YEAR)),
                gregorianCalendar.get(Calendar.MONTH),gregorianCalendar.get(Calendar.DATE));
    }

    public java.util.Date getGregorianCalendar() {
        return gregorianCalendar.getTime();
    }

    public Date() {

    }
}
