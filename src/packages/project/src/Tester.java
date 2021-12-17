package packages.project.src;

public class Tester {

    Person person1 =  new Person(); // package packages.project.src;

    packages.project.src.api.Person person2 = new packages.project.src.api.Person(); // needs full path because both classes are called PersonRecord and java needs to understand the difference

}
