public class StudentTest {
    public static void main(String[] args){
        // object creation
        Student s1 = new Student();
        // object manipulation
        s1.name = "Peter";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Maciek";
        s2.age = 12;

        Student s3 = new Student();
        s3.name = "Karol";
        s3.age = 33;
        s3.idCard = 123456;
        s3.idCardValid = false;
        s3.semesterNumber = 3;
        s3.averageGrade = 4.3f;

        /* 
        s1.sayHello();
        s1.displayName();
        s1.displayAge();

        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        */

        s3.displayAge();
        s3.displayName();
        s3.sayHello();
        s3.studentInfo();
        s3.idCardStatusChange(true);
        s3.idInfo();
    }
}
