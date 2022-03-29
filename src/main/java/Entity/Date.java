package Entity;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

public class Date {
    PersianCalendar persianCalendar;
    public Date(int year, int month, int day) {
        persianCalendar = new PersianCalendar(year,month,day);

    }

}
