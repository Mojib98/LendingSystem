package Entity;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
@Embeddable
@NoArgsConstructor
public class Borrow {

    private String disk=null;
    private Date date=null;

    public Borrow(String disk, Date date) {
        this.disk = disk;
        this.date = date;
    }

    public String getDisk() {
        return disk;
    }

    public Date getDate() {
        return date;
    }
    public Boolean isLate(Date date){
        long diffInMillies = Math.abs(this.date.getGregorianCalendar().getTime() - date.getGregorianCalendar().getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        Boolean check=diff>=7?true:false;
        return check;
    }
}
