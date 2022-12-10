package week11_review.PersonTask;

public class UnderGraduateStudent extends Student{

    public UnderGraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " studies as an undergraduate student");
    }
}
