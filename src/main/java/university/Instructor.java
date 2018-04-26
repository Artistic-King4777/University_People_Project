package university;

public class Instructor extends Person implements ITeacher{

    //Person extension:*****
    public Instructor(long ID, String name) {
        super(ID, name);
    }

    //implementation methods below:
    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
    //named learner calling learn method from ILearner interface


    public void lecture(ILearner[] learners, double numberOfHours) {
        for(int a = 0; a < learners.length; a++){
            learners[a].learn(numberOfHours);
        }
    }
    //made learners an array//loops
    // how long the teacher teaches ALL the students

}
