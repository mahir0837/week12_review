package week11_review.PersonTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void unitTesting(){

        System.out.println(getJobTitle()+" "+getName()+ " is unit testing.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding");
    }

}
