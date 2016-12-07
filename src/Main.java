import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 06.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan",16);
        Person sergei = new Person("Sergei",18);
        Person vasya = new Person("Vasya",20);
        List<Person> persons = new ArrayList<>();
        persons.add(ivan);
        persons.add(sergei);
        persons.add(vasya);
        for(Person person : PersonFilter.elderThan18(persons)){
            System.out.println(person);
        }
    }
}
