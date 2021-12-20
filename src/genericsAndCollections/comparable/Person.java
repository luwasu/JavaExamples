package genericsAndCollections.comparable;

class Person implements Comparable<Person> {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}

