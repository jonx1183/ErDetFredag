package services;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Calculator {

  private String result;
  private LocalDate date = LocalDate.now();

  public String calc(){
    if(date.isEqual(LocalDate.ofEpochDay(5))){
      return result = "Yes";
    }
    else return result = "No";
  }

  public LocalDate getDate() {
    return date;
  }

  public String getResult() {
    return result;
  }
}
