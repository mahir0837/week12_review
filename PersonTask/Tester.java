package week11_review.PersonTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void smokeTest(){
        System.out.println(getJobTitle()+" "+getName()+" is smoke testing.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is finding bugs");
    }
}
