package Entity;

import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Setter
@Getter
public class Bank {

    private Person person;
    List<Person> list = new LinkedList<Person>();
    int count2;
    int count;

    public void  runner(){
        Scanner input = new Scanner(System.in);
        System.out.println("please insert of---and ---- white space");
        String strin[] = input.nextLine().split(" ");
         count = Integer.parseInt(strin[0]);
         count2 = Integer.parseInt(strin[1]);
        for (int i =0;i<count;i++){
            String strin1[] = input.nextLine().split(" ");
            Date date = new Date(Integer.parseInt(strin1[0]),Integer.parseInt(strin1[1]),Integer.parseInt(strin1[2]));
            if (checkPerson(strin1[3])){
                int s=find(strin1[3]);
                if (list.get(s).getList().contains(strin1[4])){
                    list.get(s).deliver(strin1[4],date);
                }
            }
            else {
                Person p = new Person(strin1[3]);
                p.borrow(strin1[4], date);
                list.add(p);

            }
        }

    }
    public Boolean checkPerson(String name){
        Person se=new Person(name);
        if (list.contains(se))
            return true;
        return false;
    }
    public Integer find(String name){
        for (int i = 0 ; i<count;i++){
            if (list.get(i).getName().equals(name))
                return i;
        }
        return 0;
    }
    public void sss(){
        for (Person person:list){
            System.out.println(person);
        }
    }
}
