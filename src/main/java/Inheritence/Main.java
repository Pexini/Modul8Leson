package Inheritence;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.fio = "Петрова Мария Васильевна";
        teacher.birthday = new Date(1975, 15, 12);
        System.out.println("Учитель " + teacher.fio + " " + teacher.birthday);
        teacher.comeToClass();
        teacher.setGrade();

        student.fio = "Мальчиков Николай Семенович";
        student.birthday = new Date(2005,12,28);
        System.out.println("Ученик " + student.fio + " " + student.birthday);
        student.comeToClass();
        student.getGrade();

    }
}
