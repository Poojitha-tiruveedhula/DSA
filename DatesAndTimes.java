import java.util.*;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DatesAndTimes
{
public static void main(String[] args)
{
LocalDate date=LocalDate.now();
LocalTime time=LocalTime.now();
LocalDate ld=LocalDate.of(1999,5,4);
LocalDateTime l=LocalDateTime.now();
ZonedDateTime z=ZonedDateTime.now();
Period p=Period.between(ld,date);
DateTimeFormatter dfm=DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");

System.out.println("date:"+date);
System.out.println("time:"+time);
System.out.println("localdatetime:"+l);
System.out.println("zoneddatetime:"+z);
System.out.println("ld:"+ld);
System.out.println("period:"+p);
System.out.println("dfm:"+l.format(dfm));
}
}

