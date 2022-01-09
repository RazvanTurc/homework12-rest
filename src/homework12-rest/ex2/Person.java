package homework12;

import java.util.Objects;

// 2.0
public class Person {
    private final String name;
    private final int age;
    private final String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = Objects.requireNonNullElse(name, "N/A");
        this.age = age < 120 && age > 0 ? age : 18;
        this.hairColour = Objects.requireNonNullElse(hairColour, "N/A");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && hairColour.equals(person.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String toString() {
        return  "\n" + "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Hair Colour: " + hairColour + "\n";
    }
}
