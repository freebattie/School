public class Teacher extends Person{
    private float salary;

    String teaching;

    Teacher(String firstName, String lastName, int age,float salary,String teaching) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.teaching = teaching;
    }


    public String salery(){
        return "My income is: "+salary+"kr";
    }

    @Override
    public String childClassInfo() {
        return salery();
    }

    @Override
    public String Greet() {
        return "Hello my name is "+getFirstName()+" "+getLastName()+" and i teach " + teaching;
    }
}
