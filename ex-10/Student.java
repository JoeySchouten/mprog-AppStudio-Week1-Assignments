/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader.
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }


  public void printName () {
    System.out.println("Name: " + name);
  }

  public void readAge () throws IOException {
    age = 0;
    while (age <= 0 || age >= 150){
      try {
        age = Integer.parseInt(stdIn.readLine());
        if (!(ok = ((age >= 0) && (age <=150))))
          System.out.println("Insert a number between 0 and 150");
        }
        catch (IOException e) {
          System.out.println("error!");
          System.exit(0);
        }
        catch (NumberFormatException e) {
          age = -1;
          System.out.println("error! please try again");

  public void printName () {
    System.out.println("Age: " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
    me.readAge();
    me.printAge();

  }
}
