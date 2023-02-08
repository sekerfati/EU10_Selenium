package com.cydeo.tests.day9_javaFaker_PropertiesReview_TestBase_DriverUtils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {






  @Test
  public  void test1(){
   // creating Faker object to reach methods:

      Faker faker= new Faker();
      System.out.println("faker.name().firstName() = " + faker.name().firstName());

      System.out.println("faker.name().lastName() = " + faker.name().lastName());

      System.out.println("faker.name().fullName() = " + faker.name().fullName());


  // numerify() method will generate random numbers in the format we have declared in the String we want to get:
      System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));


  // you can specify what kind of data you want to generate:
      System.out.println("faker.numerify(\"0312-###-###-#####\") = " + faker.numerify("0312-###-###-#####"));



// letterify() method will return random letters where we pass ?  :

      System.out.println("faker.letterify(\"???-?????\") = " + faker.letterify("???-?????"));

// bothify() method will return random letters and numbers where we pass  # and ?  :

      System.out.println("faker.bothify(\"###-???-####-03\") = " + faker.bothify("###-???-####-03"));


      System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", ""));


      System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Fatih"));







  }


}
