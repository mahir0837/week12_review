package week11_review.PersonTask;

public class Person {

    private String name;
    private  int age;
    private char gender;

    public String getName() {
        return name;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name.isEmpty()||name==null){
            System.err.println("Invalid name : "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age : "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        return getClass().getSimpleName()+
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender ;
    }
}
/*
Inheritance Practice
	1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields
            	restrictions for the fields:
            		name can not be empty
            		name can not be null
            		age can not be negative
            		age can not be zero

            Add a constructor to set all the fields
            	(Make sure all the restrictions are applied)

            Methods:
                eat()
                drink()
                sleep()
                toString()

 */