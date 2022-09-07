package controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.Calculator;


@RestController
public class Controller {

  Calculator calculator = new Calculator();

  @GetMapping
  public String index(){
    return "";
  }
  @GetMapping("isFriday")
  public String isFriday(){
    return calculator.getResult();
  }
}
