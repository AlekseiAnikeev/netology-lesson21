import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 18.08.2022
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Владислав", "Силантьев", 70));
        people.add(new Person("Михаил", "Аникеев", 75));
        people.add(new Person("Светлана", "Силантьева", 30));
        people.add(new Person("Александра", "Аникеева", 10));
        System.out.println(people);
        people.sort(new PersonComparator());
        System.out.println(people);
        System.out.println();
        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Светлана", "Силантьева", 30));
        people2.add(new Person("Светлана", "Силантьева", 35));
        people2.add(new Person("Светлана", "Силантьева", 22));
        people2.add(new Person("Светлана", "Силантьева", 15));
        System.out.println(people2);
        people2.sort(new PersonComparator());
        System.out.println(people2);
    }
}
