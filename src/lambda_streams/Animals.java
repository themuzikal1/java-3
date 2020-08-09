package lambda_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Animals {
    //This class will be using streams.


    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("peacoCK");
        animals.add("rabbit");
        animals.add("chiwawa");
        animals.add("OranguTAN");
        animals.add("vipeR");
        animals.add("cobra");
        animals.add("paNDa");
        animals.add("bUffalo");
        animals.add("DeeR");
        animals.add("maLLard");

        System.out.println("original animals : " + animals);


        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        List<String> cleaned = capsFirst(animals, false);
        System.out.println("Cleaned : " + cleaned);

        //do not modify these addAnimal() method invocations
        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");

        //---------------------------------------

        capsFirst(animals,true);
        System.out.println(animals);

        List<String> lowered = lowerFirst(animals,false);
        System.out.println("lowered : " + lowered);



    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        //clean up the animals list so that the first letter is capitalized, and all the other letters are lowercased.
        // Use a stream to accomplish this task.  Also, the 2nd parameter of this function is a boolean.
        // use this boolean 'flag' to determine whether or not to 'mutate' the original animals array stored as a static class field.
        // if the flag is set to 'true', mutate the animals and return the animals out of the function.
        // if it is false, create a copy of the animals, perform your stream operations on the copy,
        // and return the copy of animals out of the function, WITHOUT modifying the original animals array.

        return animaList;
    }

    static String addAnimal(String animal) {
        //add an animal to the animal list.
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("peacoCK");
        animals.add("rabbit");
        animals.add("chiwawa");
        animals.add("OranguTAN");
        animals.add("vipeR");
        animals.add("cobra");
        animals.add("paNDa");
        animals.add("bUffalo");
        animals.add("DeeR");
        animals.add("maLLard");

        ArrayList<String> addAnimal = new ArrayList<String>(animals);
        addAnimal.add("Kitty");
        System.out.println(addAnimal);

        return animal;
    }


    static List<String> lowerFirst(List<String> addAnimal, boolean mutate) {
        //lowercase the first letter, and uppercase the rest of the letters, using streams.  Also, depending on the value of the boolean flag 'mutate', mutate the original animals list, or perform your stream operations on a 'copy' of the animals list.  return the list out of hte function in both cases.
        ArrayList<String> lowerFirst = new ArrayList<String>(addAnimal);
        lowerFirst.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowerFirst);
        return lowerFirst;
    }

    static String flipAnimals(String animal) {
        //reverse the order of the animals in the animal list.  If the booleaen parameter is true, reverse the static animals array list by mutating the array.  if the mutate boolean is false, flip a 'copy' of the animals list, then return that list of flipped animals, WITHOUT mutating the static animals array. return the flipped list in both cases.

        //List<String> instructions = asList("Flip","the","animals","list","."," ","Mutate","the","animals","only","if","flag","true");
        List<String> flipAnimal = new ArrayList<String>();
        flipAnimal.add("peacoCK");
        flipAnimal.add("rabbit");
        flipAnimal.add("chiwawa");
        flipAnimal.add("OranguTAN");
        flipAnimal.add("vipeR");
        flipAnimal.add("cobra");
        flipAnimal.add("paNDa");
        flipAnimal.add("bUffalo");
        flipAnimal.add("DeeR");
        flipAnimal.add("maLLard");


        System.out.println("Before reverse");
        System.out.println(flipAnimal);
        Collections.reverse(flipAnimal);
        System.out.println("reversed" + flipAnimal);


        return animal;
    }

    static String sortAnimals(String animal) {
    //sort the animals in alphabetical order.  If the booleaen parameter is true, mutating the animals list.  if the mutate boolean is false, sort a 'copy' of the animals list, then return that list of sorted animals, WITHOUT mutating the static animals array. return the sorted list in both cases.
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("peacoCK");
        animals.add("rabbit");
        animals.add("chiwawa");
        animals.add("OranguTAN");
        animals.add("vipeR");
        animals.add("cobra");
        animals.add("paNDa");
        animals.add("bUffalo");
        animals.add("DeeR");
        animals.add("maLLard");

        ArrayList<String> sortAnimals = new ArrayList<String>();
        Collections.sort(sortAnimals);

        System.out.println("Sorted" + sortAnimals);


        return animals;
    }



}
