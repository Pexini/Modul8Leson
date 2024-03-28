package Inheritence;

public class Student extends Person{
    String group;
    void getGrade(){
        System.out.println("Получил оценку");
    }

    @Override
    void homeTask() {
        System.out.println("Выполняет");
    }
}
