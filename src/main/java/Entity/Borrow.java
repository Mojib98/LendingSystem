package Entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.util.Objects;

@SuppressWarnings("ALL")
@NoArgsConstructor
@Getter
@ToString
public class Borrow {

    private String disk=null;
    private Date date=null;

    public Borrow(String disk, Date date) {
        this.disk = disk;
        this.date = date;
    }
    public Boolean isLate(Date deliveryDate){
        if (deliveryDate.getDay()>this.date.getDay())
            return true;
        else if(deliveryDate.getMonth()>this.date.getMonth())
            return true;
        else if (deliveryDate.getYear()>this.date.getYear())
            return true;
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Borrow borrow = (Borrow) o;
        return Objects.equals(disk, borrow.disk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disk);
    }
}
