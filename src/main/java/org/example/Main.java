package org.example;
import java.time.LocalDateTime;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        LocalDateTime actualDate = LocalDateTime.now();

        System.out.println("Aktuelles Datum: " + actualDate);

        System.out.println("Aktuelles Datum in zwei Wochen: " +actualDate.plusWeeks(2));

        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2023, 9, 29);

        if (currentDate.isBefore(futureDate)){
            System.out.println("Das aktuelle Datum liegt vor dem festgelegten Datum.");
        }else if (currentDate.isAfter(futureDate)){
            System.out.println("Das aktuelle Datum liegt nach dem festgelegten Datum.");
        }else {
            System.out.println("Das aktuelle Datum ist gleich dem festgelegten Datum.");
        }
    }
}