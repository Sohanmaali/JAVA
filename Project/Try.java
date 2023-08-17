class Student {
    String name;
    int age;
    Semester[] semesterData;

    Student(String name, int age, Semester[] semesterData) {
        this.name = name;
        this.age = age;
        this.semesterData = semesterData;
    }
}

class Semester {
    int semester;
    String[] subjects;

    Semester(int semester, String[] subjects) {
        this.semester = semester;
        this.subjects = subjects;
    }
}

class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[] {
                new Student("Alice", 18, new Semester[] {
                        new Semester(1, new String[] { "Math", "Science", "History" }),
                        new Semester(2, new String[] { "English", "Art", "Physical Education" })
                })
        // };
        System.out.println(studentArray[0].name); // Output: Alice
        System.out.println(studentArray[1].semesterData[2].subjects[1]); // Output: Physics
    }
}
