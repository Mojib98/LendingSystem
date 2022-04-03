package Entity;

import lombok.*;

import java.beans.Transient;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Date {
    private Integer year,month,day;


    public static Integer numDay(Date date1,Date date2){
        int day=0;
        if (date1.getYear()>date2.getYear())
            day +=365*date1.getYear()-date2.getYear();
        if (date1.getMonth()>date2.getMonth())
            day +=30*date1.getMonth()-date2.getMonth();
        if (date1.getDay()>date2.getDay())
            day +=date1.getDay()-date2.getDay();
        return day;

    }
}
