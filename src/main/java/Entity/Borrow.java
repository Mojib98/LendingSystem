package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@SuppressWarnings("ALL")
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
}
