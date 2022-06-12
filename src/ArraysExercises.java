import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);  // will print reference variable info/memory location
        System.out.println(Arrays.toString(numbers)); // print elements in arr

        Person[] people = {
                new Person("Justin"),
                new Person("Thomas"),
                new Person("Tuvera")
        };

        // iterate and print original arr
        for(Person person : people){
            System.out.println("person.getName() = " + person.getName());
        }

        Person newestPerson = new Person("Sebastian");
        Person[] newPeople = addPerson(people, newestPerson);

        // iterate and print new arr with added person
        System.out.println(" ");
        for(Person person : newPeople){
            System.out.println("person.getName() = " + person.getName());
        }
    }

    // IN -> Person[], Person - OUT -> Person[]
    public static Person[] addPerson(Person[] originalArr, Person newPerson){
        int newLength = originalArr.length + 1;
        Person[] newArr = new Person[newLength];

        for(int i = 0; i < originalArr.length; i++){  // copy elements from old array to new one
            newArr[i] = originalArr[i];
        }

        newArr[newLength - 1] = newPerson;  // add new person at the end of array
        return newArr;
    }
}
