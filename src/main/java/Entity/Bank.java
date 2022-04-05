package Entity;


import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Setter
@Getter
public class Bank {

    private Person person;
    private List<Person> list = new LinkedList<>();
    private List<Disk> disks = new LinkedList<>();
    private int penalty;
    private int task;

    public void runner() {
        Scanner input = new Scanner(System.in);
        System.out.println("please insert of---and ---- white space");
        String strin[] = input.nextLine().split(" ");
        task = Integer.parseInt(strin[0]);
        penalty = Integer.parseInt(strin[1]);
        for (int i = 0; i < task; i++) {
            System.out.println("for in= " + i);
            String strin1[] = input.nextLine().split(" ");
            Date date = new Date(Integer.parseInt(strin1[2]), Integer.parseInt(strin1[1]), Integer.parseInt(strin1[0]));
            if (checkPerson(strin1[3])) {
                int number = find(strin1[3]);
                if (list.get(number).getList().contains(new Borrow(strin1[4], null))) {
                    list.get(number).deliver(strin1[4], date);
                    disks.remove(new Disk(strin1[4]));
                } else list.get(number).borrow(strin1[4], date);
            } else {
                Person p = new Person(strin1[3]);
                p.borrow(strin1[4], date);
                list.add(p);
                disks.add(new Disk(strin1[4]));

            }
        }

    }

    public Boolean checkPerson(String name) {
        Person se = new Person(name);
        if (list.contains(se)) {
            return true;
        }
        return false;
    }

    public Integer find(String name) {
        for (int i = 0; i < task; i++) {
            if (list.get(i).getName().equals(name))
                return i;
        }
        return 0;
    }

    public void show() {
        System.out.println("fine");
        for (Person person : list) {
            System.out.println(person.getName() + ": " + person.dayLate * penalty);
        }
        System.out.println("Borrows Disk");
        for (Disk d : disks) {
            System.out.println(d);
        }

    }
}
