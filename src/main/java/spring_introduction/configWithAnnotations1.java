package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplacationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYouPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
