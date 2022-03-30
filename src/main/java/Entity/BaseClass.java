package Entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private   Integer id;

    public BaseClass(Integer id) {
        this.id = id;

    }
}
