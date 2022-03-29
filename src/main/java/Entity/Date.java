package Entity;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class Date {
    @Column
    java.sql.Date date;
    @Transient
    PersianCalendar persianCalendar;
    public Date(int year, int month, int day) {
        persianCalendar = new PersianCalendar(year,month,day);
        date = new java.sql.Date(persianCalendar.get(Calendar.YEAR),
                persianCalendar.get(Calendar.MONTH),
                persianCalendar.get(Calendar.DAY_OF_MONTH));
    }

    public java.sql.Date getDate() {
        return this.date;
    }

    public Date() {

    }
}
