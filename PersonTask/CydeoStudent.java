package week11_review.PersonTask;

public class CydeoStudent extends Student {

    private String groupName, progLanguage;
    private int batchNum;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String groupName, String progLanguage, int batchNum) {
        super(name, age, gender, studentId, fieldOfStudy, "Cydeo", grade);
        setGroupName(groupName);
        setProgLanguage(progLanguage);
        setBatchNum(batchNum);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        if (groupName==null){
            System.out.println("Group name can not be null");
            System.exit(1);
        }
        if (groupName.isEmpty()){
            System.out.println("Group name can not be empty");
            System.exit(1);
        }
        this.groupName = groupName;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        boolean IsvalidPL=progLanguage.equalsIgnoreCase("Java")||progLanguage.equalsIgnoreCase("Python")||progLanguage.equalsIgnoreCase("Java Script");
        if (!IsvalidPL){
            System.err.println("Invalid Programming Language");
            System.exit(1);
        }
        this.progLanguage = progLanguage;
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {
        if (batchNum<=0){
            System.err.println("Invalid Batch number");
            System.exit(1);
        }
        this.batchNum = batchNum;
    }



    @Override
    public String toString() {
        return getClass().getSimpleName()+
        super.toString().replace("CydeoStudent","")+
                " groupName='" + groupName + '\'' +
                ", progLanguage='" + progLanguage + '\'' +
                ", batchNum=" + batchNum +
                '}';
    }
}
/*
5.3 CydeoStudent
					Additional Variables:
						batchNum, groupName, progLanguage

						Encapsulate all the fields
							restrictions for the fields:
								batch number can not be zero or negative
								groupName can not be empty or null
								groupName can not start with a digit or special characters
								progLanguage must be set to one of the followings:
									{"Java", "Python", "JavaScript"}

					Override the toString method to make sure that batchNum, groupName, progLanguage are included when the object of CydeoStudent is printed
 */