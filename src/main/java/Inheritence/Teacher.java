package Inheritence;

public class Teacher extends Person{
    String group;
    void setGrade(){
        System.out.println("Поставил оценку");
    }

    @Override
    void homeTask() {
        System.out.println("Задает");
    }
}
