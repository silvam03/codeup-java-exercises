import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        Person person1 = new Person("Bob");
        Person person2 = new Person("Craig");
        Person person3 = new Person("Rob");
        Person person4 = new Person("Walter");


        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        for (Person person: people) {
            System.out.println(person.getName());
        }

        addPerson(people, person4);
    } // Main end
    public static Person[] addPerson(Person[] oldArray, Person newPerson) {
        Person[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length - 1] = newPerson;
        System.out.println(newArray[oldArray.length - 1].getName());
        return newArray;
    }

} // ArrayExercises end