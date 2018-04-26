package university;

public class Student extends Person implements ILearner{

    private double totalStudyTime;


    Student(long ID, String name, double totalStudyTime) {
        super(ID, name);
        this.totalStudyTime = totalStudyTime;
    }


    public void learn(double numberOfHours){
        System.out.println(getTotalStudyTime() * numberOfHours);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "totalStudyTime=" + totalStudyTime +
                '}';
    }
}
