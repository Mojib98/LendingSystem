package Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Date {
    private Integer year,month,day;
    static int allDay =0;


    public static Integer numDay(Date borrow,Date deliver){
        if (deliver.getMonth()<12 &borrow.getMonth()==12) {
            int m1 = deliver.getMonth()-29;
            allDay +=  (deliver.getMonth() * 30) + deliver.getDay() +m1+
                    (((deliver.getYear() - 1) - borrow.getYear()) * 360);
            return allDay;
        }
        if (deliver.getYear()>deliver.getYear() & deliver.getMonth()<borrow.getMonth()){
            allDay= ((12-borrow.getMonth()-1)+deliver.getMonth()*30+29) +
                    (((deliver.getDay()-borrow.getYear()-1))*360)+
                    (Math.abs(deliver.day-borrow.getDay()));
            return allDay;
        }
        if (deliver.getYear()>borrow.getYear())
            allDay +=365*(deliver.getYear()-borrow.getYear());
        if (deliver.getMonth()>borrow.getMonth()) {
            /*if (deliver.getMonth()==12)
                allDay += 29 * deliver.getMonth() - borrow.getMonth();
*/
            allDay += 30 * (deliver.getMonth() - borrow.getMonth());
        }

            allDay +=deliver.getDay()-borrow.getDay();
        return allDay;

    }
  /*  private static  Integer numMonth(Date borrow,Date deliver){
        if (deliver.getMonth()<12 &borrow.getMonth()==12){
            int m1=deliver.month;
            int m2=12 - deliver.getMonth();
            this.allDay +=(29-borrow.getMonth())+(deliver.getMonth()*30)+deliver.getDay()+
                    (((deliver.getYear()-1)- borrow.getYear())*360);
            return allDay;
        }


    }*/

}
