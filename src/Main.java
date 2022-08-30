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
        System.out.println(people);
        people.sort((o1,o2) -> {String[] firstNameCount = o1.getSurname().split(" ");
            String[] secondNameCount = o2.getSurname().split(" ");
            if (firstNameCount.length >= 2 && secondNameCount.length >= 2) {
                if (firstNameCount.length != secondNameCount.length) {
                    return Integer.compare(firstNameCount.length, secondNameCount.length);
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }});
        System.out.println(people);
        System.out.println();
        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат", 30));
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат", 35));
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат", 22));
        people2.add(new Person("Светлана", "Силантьева Ибн Рахат Лукум", 15));
        System.out.println(people2);
        people2.sort((o1, o2) -> {
            String[] firstNameCount = o1.getSurname().split(" ");
            String[] secondNameCount = o2.getSurname().split(" ");
            if (firstNameCount.length >= 3 && secondNameCount.length >= 3) {
                if (firstNameCount.length != secondNameCount.length) {
                    return Integer.compare(firstNameCount.length, secondNameCount.length);
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(people2);
    }
}
