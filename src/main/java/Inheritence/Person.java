package Inheritence;

import java.util.Date;

public abstract class Person {
    String fio;
    Date birthday;
    void comeToClass(){
        System.out.println("Пришел на урок");
    }
    abstract void homeTask();

}
