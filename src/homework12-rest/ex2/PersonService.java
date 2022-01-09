package homework12;

import java.util.*;

public class PersonService {
    private final List<Person> persons;

    public PersonService(Collection<Person> persons) {
        this.persons = persons == null ?
                new ArrayList<>() :
                new ArrayList<>(persons);
    }

    // 2.1
    public List<String> personNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    // 2.2
    public Map<String, Integer> nameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    // 2.3
    public List<Person> olderThan(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age)
                result.add(person);
        }
        return result;
    }

    // 2.4
    public Map<String,List<String>> byHairColour() {
        Map<String,List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> personsName = result.get(person.getHairColour());
            if(personsName == null) {
                personsName = new ArrayList<>();
                result.put(person.getHairColour(), personsName);
            }
            personsName.add(person.getName());
        }
        return result;
    }

    // 2.5
    public Map<Integer,List<Person>> byAge() {
        Map<Integer,List<Person>> result = new HashMap<>();
        for (Person person : persons) {
            List<Person> personsAge = result.get(person.getAge());
            if(personsAge == null) {
                personsAge = new ArrayList<>();
                result.put(person.getAge(), personsAge);
            }
            personsAge.add(person);
        }
        return result;
    }


}
