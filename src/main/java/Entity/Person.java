package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Setter
@Getter
@Embeddable
public class Person {
    private String Name;
    private Borrow borrow;
    public Person(String name) {
        Name = name;
    }

    public Person() {

    }
    public void borrow(String disk,  Date date){
        this.borrow=new Borrow(disk,date);
    }
    public void deliver(String disk, Date date){
        this.borrow=new Borrow(disk,date);
    }
}


