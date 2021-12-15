package classes;

public class Person {

    private String firstName;
    private String lastName;
    private String work;


    public Person(String firstName, String lastName, String work) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.work = work;
    }

    public void eat (String food){
        System.out.println("I am eating " + food + "!");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "firstName = " + firstName + ", lastName = " + lastName + ", work = " + work;
    }
}
