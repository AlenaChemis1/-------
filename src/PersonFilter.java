import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 06.12.2016.
 */
public class PersonFilter {
    static List<Person> elderThan18(List<Person> persons){
        List<Person> soldiers = new ArrayList<>();
        for(Person person : persons){
            if(person.getAge() >= 18){
                soldiers.add(person);
            }
        }
        return soldiers;
    }
}
