import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Class representing a Person
class Person implements Comparable<Person> {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }

  // Implementing Comparable interface to compare Persons based on age
  @Override
  public int compareTo(Person other) {
    return Integer.compare(this.age, other.age);
  }
}

public class Test {

  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("babli", 30));
    people.add(new Person("kalu", 25));
    people.add(new Person("rikama", 35));

    // Sorting using Comparable interface (natural ordering based on age)
    Collections.sort(people);
    System.out.println("Sorted list by age (Comparable):");
    for (Person person : people) {
      System.out.println(person);
    }

    // Sorting using Comparator interface (custom ordering based on name)
    // Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
    Comparator<Person> nameComparator = (p1, p2) ->
      p1.getName().compareTo(p2.getName());

    Collections.sort(people, nameComparator);
    System.out.println("\nSorted list by name (Comparator):");
    for (Person person : people) {
      System.out.println(person);
    }
  }
}
