import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 18.08.2022
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Владислав", "Силантьев Аникеев", 70));
        people.add(new Person("Михаил", "Аникеев Силантьев Силантьев", 75));
        people.add(new Person("Светлана", "Силантьева Аникеев Силантьев", 30));
        people.add(new Person("Александра", "Аникеева Силантьев", 10));
        people.add(new Person("Александра", "Аникеева Силантьев Славроса", 14));
        System.out.println(people);
        people.sort(new PersonComparator(2));
        System.out.println(people);
        System.out.println();
        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат", 30));
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат", 35));
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат", 22));
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат Лукум", 15));
        people2.add(new Person("Александра", "Аникеева Силантьев Славроса", 14));
        System.out.println(people2);
        people2.sort(new PersonComparator(3));
        System.out.println(people2);
        System.out.println();
        people.removeIf((o1) -> o1.getAge() < 18);
        System.out.println(people);
        System.out.println();
        people2.removeIf((o1) -> o1.getAge() < 18);
        System.out.println(people2);
    }
}
