package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private String age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is create!");
//        this.pet = pet;
//    }


    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYouPet() {
        System.out.println("hello, my lovely Pet!");
        pet.say();
    }
}