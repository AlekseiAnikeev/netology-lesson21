/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 18.08.2022
 */
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
