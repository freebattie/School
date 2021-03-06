public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public abstract String childClassInfo();
    public abstract String Greet();
}
