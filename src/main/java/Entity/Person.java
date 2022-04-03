package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

public class Person {
    private String Name;
    private Borrow borrow;

    public Person(String name) {
        Name = name;
    }

    public Integer dayLate;
    private List<Borrow> list = new ArrayList<>();

    public void borrow(String disk, Date date) {
        this.borrow = new Borrow(disk, date);
        list.add(borrow);
    }

    public void deliver(String disk, Date date) {
        this.borrow = new Borrow(disk, date);
        if (list.contains(borrow)) {
            for (Borrow b : list) {
                if (b.getDisk().equals(disk)) {
                    if (b.isLate(date)) {
                    this.dayLate=Date.numDay(b.getDate(),date);
                    break;
                    }

                }
            }

        }
        list.remove(borrow);
    }

}


