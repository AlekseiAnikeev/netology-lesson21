import java.util.Comparator;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 18.08.2022
 */
public class PersonComparator implements Comparator<Person> {
    private final int wordCount;

    public PersonComparator(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] firstNameCount = o1.getSurname().split(" ");
        String[] secondNameCount = o2.getSurname().split(" ");
        if (firstNameCount.length >= wordCount && secondNameCount.length >= wordCount) {
            if (firstNameCount.length != secondNameCount.length) {
                return Integer.compare(firstNameCount.length, secondNameCount.length);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}


