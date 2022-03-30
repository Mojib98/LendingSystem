package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Bank {
    @Id()
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Integer id;
    private Person person;

    public Bank(Person person) {
        this.person = person;
    }

    public Bank() {

    }

    public Bank(Integer id, Person person) {
        this.id = id;
        this.person = person;
    }
}
