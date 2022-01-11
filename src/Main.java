public class Main {

    public static void main(String[] args) {
        Person teacher1 = new Teacher("per", "normann", 44, 400000, "math");
        Person student1 = new Student("kim", "Normann", 21, 50, 70, 65);


        System.out.println(teacher1.childClassInfo());
        System.out.println(student1.childClassInfo());

        // System.out.println(teacher1.salery()); dette går ikke siden den er av type Person

        Teacher teacher2 = (Teacher) teacher1;// downcast
        if (teacher2 instanceof Teacher) {
            System.out.println(teacher2.salery()); // dette går siden vi har down castet til Teacher classen.
        }

        // student1.AddGrade(30); dette går ikke da dette er av type Person
        Student student2 = (Student) student1;
        if (student2 instanceof Student) {
            student2.AddGrade(30); // dette går siden vi har down castet til Student classen.
        }

        // vist vi nå printer ut gjenomsnitt karakteren for student1 så ser vi den har endret seg etter at vi la til en karakter til student2 variablet
        System.out.println(student1.childClassInfo());// student2 referer forsatt til samme ting som student1 OBS
    }
}