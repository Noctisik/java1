package lab;

public class Human {
    String name;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    String surname;
    int age;

    {
        System.out.println("New human created");
    }

    static {
        System.out.println("Class Human loaded");
    }

    Human(){
        System.out.println("Constructor called");
    }

    Human(String name, int age){
        this(name);
        this.age = age;
    }

    Human(String name){
        this();
        this.name = name;
        this.age = 0;
    }

/*    void sayName(){
        System.out.println("Hello my name is " + name);
    }*/
}


