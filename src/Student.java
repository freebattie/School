import java.util.ArrayList;

public class Student extends Person{

    ArrayList<Float> grades = new ArrayList<Float>();
    Student(String firstName, String lastName, int age,float grade1,float grade2,float grade3) {
        super(firstName, lastName, age);
        grades.add(grade1);
        grades.add(grade2);
        grades.add(grade3);
    }

    @Override
    public String childClassInfo() {
        return "I am " + getAge()+ " years and my average grades are " +getAverageGrade();
    }

    public void AddGrade(float grade){

        grades.add(grade);
    }
    public float getAverageGrade(){
        float sum =0;
        for (float val : grades){
            sum += val;
        }
        sum /= grades.size();
        return sum;
    }
    @Override
    public String Greet() {
        return "Hello my name is "+getFirstName()+" "+getLastName();
    }
}
