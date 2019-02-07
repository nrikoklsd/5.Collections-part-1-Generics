package main;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
/*
import com.google.common.base.Function;
import com.google.common.collect.Lists;

*/
public class Add_string_into_List_of_Integers {



//task: Try how you can add string into List<Integers>.
//before using this methods you should save your string into list<String>

    //first method
    //Using Java 8 Stream API:

    // Generic function to convert List of
    // String to List of Integer

        public static <T, U> List<U>
        convertStringListToIntList(List<T> listOfString,
                                   Function<T, U> function)
        {
            return listOfString.stream()
                    .map(function)
                    .collect(Collectors.toList());
        }

        public static void main(String args[])
        {

            // Create a list of String
            List<String> listOfString = Arrays.asList("1", "2", "3",
                    "4", "5");

            // Print the list of String
            System.out.println("List of String: " + listOfString);

            // Convert List of String to list of Integer
            List<Integer> listOfInteger = convertStringListToIntList(
                    listOfString,
                    Integer::parseInt);

            // Print the list of Integer
            System.out.println("List of Integer: " + listOfInteger);
        }



/*

    //second method
    //Using Guava’s List.transform():




        // Generic function to convert List of
        // String to List of Integer
        public static <T, U> List<U>
        convertStringListToIntList(List<T> listOfString,
                                   Function<T, U> function)
        {
            return Lists.transform(listOfString, function);
        }

        public static void main(String args[])
        {

            // Create a list of String
            List<String> listOfString = Arrays.asList("1", "2", "3",
                    "4", "5");

            // Print the list of String
            System.out.println("List of String: " + listOfString);

            // Convert List of String to list of Integer
            List<Integer>
                    listOfInteger = convertStringListToIntList(listOfString,
                    Integer::parseInt);

            // Print the list of Integer
            System.out.println("List of Integer: " + listOfInteger);
        }
*/

}
