package com.mphasis.main.cui;

import com.mphasis.entities.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Person> people=createPeople();
        //Map<Integer, Person> result= people.stream()
          //      .collect(Collectors.toMap(person -> person.getId(),person -> person));
        //System.out.println(result);
        /*Map<Integer, List<Person>> result= people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result);

         */
        Map<Integer, List<String>> result= people.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
        System.out.println(result);
    }
    public static List<Person> createPeople(){
        return Arrays.asList(
                new Person(1,"Ramji",30),
                new Person(2,"Sandyji",25),
                new Person(3,"Pranshul",22),
                new Person(4,"Sahu",22)
        );
    }
}
