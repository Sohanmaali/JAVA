import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person_Comparator {

  public static void main(String[] args) {
    List<Person> p = new ArrayList<>();
    p.add(new Person(10, "sohan"));
    p.add(new Person(32, "mohan"));
    p.add(new Person(10, "rohan"));
    p.add(new Person(52, "renu"));
    p.add(new Person(63, "raj"));
    p.add(new Person(5, "sk"));

    Collections.sort(p);

    System.out.println("Naturel sorting order");

    for (Person person : p) {
      System.out.println(person);
    }

    Comparator<Person> com = new Comparator<Person>() {
      public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
      }
    };

    Collections.sort(p, com);

    System.out.println("\nCustome Sorting Order\n");
    for (Person person : p) {
      System.out.println(person);
    }
  }
}

class Person implements Comparable<Person> {

  int age;
  String name;

  public Person() {}

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int compareTo(Person p) {
    return Integer.compare(this.age, p.getAge());
  }

  @Override
  public String toString() {
    return "Person {" + " name = '" + name + '\'' + ", age = " + age + " }";
  }
}
