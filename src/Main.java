public class Main {
    public static void main(String[] args) {
        Student yeison = new Student("yeison", "567338",34, 'm');
        Student ivanna = new Student();
        System.out.println(yeison);
        System.out.println(ivanna);
        System.out.println(yeison.studentId);
        System.out.println(ivanna.studentId);

        yeison.tellInfo();
        yeison.repeatAfter("Hola?");
    }

}
