package records;

import java.util.Locale;

public record PersonRecord(String name, int age, String hobby) {


    public PersonRecord(String name, int age) {
        this(name, age, null);
    }

    public String nameAsUpperCase() {
        return name().toUpperCase();
    }

    public static String nameInLowerCase(PersonRecord personRecord) {
        return personRecord.name.toLowerCase();
    }


}
