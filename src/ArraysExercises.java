import java.util.Arrays;

public class ArraysExercises {

    static Person[] addPerson(Person[] incomingArray, Person newPerson ){

        Person[] longerArrayCopy = Array.copyOf
        (incomingArray, incomingArray.lenght+1);

        System.out.println(incomingArray.length);
        System.out.println(longerArrayCopy.lenght);



        return new Person[0];

    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person firstPerson = new Person("Lady");
        Person secondPerson = new Person("Hornet");
        Person thirdPerson = new Person("Meow");

        Person[] people = {firstPerson, secondPerson, thirdPerson};

//        for(Person person : people) {
//            System.out.println(person.getName());
//        }


//        addPerson(people, new Person("test));









    }
}
