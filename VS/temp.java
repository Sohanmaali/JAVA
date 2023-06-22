

// A class to represent a student
class Student {
  int rollNo;
  String name;

  // A constructor to initialize the student object
  Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
  }
}

// A class to demonstrate how to create an array of objects
class Main {
  public static void main(String[] args) b{
    // Declare and instantiate an array of student references
    Student[] students = new Student[3];

    // Initialize each element of the array with a student object
    students[0] = new Student(101, "Alice");
    students[1] = new Student(102, "Bob");
    students[2] = new Student(103, "Charlie");

    // Print the details of each student
    for (Student s : students) {
      System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name);
    }
  }
}