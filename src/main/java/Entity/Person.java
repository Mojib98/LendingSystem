package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Setter
@Getter
@Embeddable
public class Person {
    private Integer debt;

}


