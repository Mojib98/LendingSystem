package Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString
public class Person {
    private String Name;
    private Borrow borrow;

    public Person(String name) {
        Name = name;
    }

    public Integer dayLate=0;
    private List<Borrow> list = new ArrayList<>();

    public void borrow(String disk, Date date) {
        this.borrow = new Borrow(disk, date);
        list.add(borrow);
    }

    public void deliver(String disk, Date date) {
//        this.borrow(disk,date);
            for (Borrow b : list) {
                if (b.getDisk().equals(disk)) {
                    if (b.isLate(date)) {
                    this.dayLate=Date.numDay(b.getDate(),date);
                    list.remove(b);
                    break;
                    }

                }
            }


        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }
    //        list.remove(borrow);
    }




