public class Student {
    String studentName;
    String studentId = "00000000";
    int studentAge;
    char studentGender;


    // constructor
    public Student() {
        System.out.println("Estudiante creado sin dato");
    }

    public Student(String name, String id, int age, char gender) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        System.out.println("estudiante creado \"" + studentName + "\" creado!");
    }
}
