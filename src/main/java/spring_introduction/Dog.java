package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {

//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("Dog bean is create!");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("Clas Dog: init metod");
    }

    public void destroy() {
        System.out.println("Clas Dog: destroy metod");
    }
}
