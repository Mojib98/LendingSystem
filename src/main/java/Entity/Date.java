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
    @Column
    GregorianCalendar gregorianCalendar;
    public Date(int year, int month, int day) {
        persianCalendar = new PersianCalendar();
         gregorianCalendar = new GregorianCalendar();
         gregorianCalendar.setTime(persianCalendar.getTime());
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        gregorianCalendar.set((gregorianCalendar.get(Calendar.YEAR)),
                gregorianCalendar.get(Calendar.MONTH),gregorianCalendar.get(Calendar.DATE));
    }

    public java.util.Date getGregorianCalendar() {
        return gregorianCalendar.getTime();
    }

    public Date() {

    }
}
