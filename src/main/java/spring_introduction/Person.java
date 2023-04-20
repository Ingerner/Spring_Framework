package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private String age;

    @Autowired
    public Person( @Qualifier("catBean")Pet pet) {
        System.out.println("Person bean is create!");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("dog")
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
