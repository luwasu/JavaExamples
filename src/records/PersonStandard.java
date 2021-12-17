package records;

import java.util.Objects;

public class PersonStandard {

    private final String name;
    private final int age;

    public PersonStandard(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PersonStandard person = (PersonStandard) obj;

        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonStandard{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
