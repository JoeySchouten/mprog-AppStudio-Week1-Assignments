import java.util.*;
import java.lang.*;
import java.io.*;

class Person {
  // Properties of the class...
  private String name;
  public  int    age;
  private String profession;

  // Constructor of the class...
  /*public Person(String aName, int anAge, String theProfession) {
      name = aName;
      age  = anAge;
      profession = theProfession;
    }*/

   // Methods of the class...

   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and I am a(n) " + profession);
      System.out.println();
      commentAboutAge();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60){
        System.out.println("old person");
      }
    }


   public void growOlder(){
     age++;
   }
   public void giveKnighthood(){
     name = "Sir" + name;
   }

   public void growOlderby(int number){
     age = age + number;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();

      ls.talk();
      wp.talk();

      wp.growOlder();
      wp.giveKnighthood();
      ls.growOlderby(10);
      System.out.println(ls.age);


   }

}
