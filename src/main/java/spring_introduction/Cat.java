package spring_introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is create!");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
