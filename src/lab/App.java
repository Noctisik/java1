package lab;

import java.util.Scanner;
import java.util.ArrayList;
/*1. Создать список ArrayList<Human> people = new ArrayList();
2. В цикле вводить имя, возраст, создавать на их основании
        объекты класса Human и класть в список(people)
        3. Прервать цикл при вводе слова "exit"
        4. Вывести информацию(имя, возраст) о всех объектах
        класса Human из списка(people) на экран*/


public class App {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList();
        Scanner in = new Scanner(System.in);
        Human person = new Human();
        String buffer = "Человек";
        int counter = 1;
        Object exit = new Object();


        while(exit!="exit"){
            System.out.println("Введите имя: ");
            person.name = in.nextLine();
            System.out.println("Введите фамилию: ");
            person.surname = in.nextLine();
            System.out.println("Введите возраст: ");
            person.age = Integer.parseInt(in.nextLine());
            people.add(buffer + " " +(String.valueOf(counter)+ ": " + person.name + " " + person.surname + ", " + person.age));
            counter = counter+1;

            System.out.println("Закончить? Для exit введите exit, для продолжить - нажимте enter!");
            exit = in.nextLine();
            if (exit.equals("exit")){
                System.out.println("Вывод окончен");
                System.out.println (people);
                break;
            }
            else{
                System.out.println("Введите нового человека");
            }
            }
        }
    }

