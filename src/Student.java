import java.security.PublicKey;

public class Student {
    String studentName;
    String studentId = "00000000";
    int studentAge;
    char studentGender;
    String studentEmail = "Por asignar.";


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

    public Student(String name, String id, int age, char gender, String email) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        studentEmail = email;
        System.out.println("estudiante creado \"" + studentName + "\" creado!");
    }
    public void tellInfo(){
        System.out.println("my name is " + studentName+ " and my id is " + studentId);
        System.out.println("I am " + studentAge + "years old and my gender " + studentGender);
    }
    public void repeatAfter(String message) {
        System.out.println("message is:" + message);

    }
    public void haveBirthday(){
        studentAge++;
    }

    public String getEmail() {
        return studentEmail;
    }
    public String toString(){
        return "student name: " + studentName;
    }
}
