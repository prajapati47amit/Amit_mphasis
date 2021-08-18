package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int result=0;
        for (int val:numbers){
            if (val%2==0)
                result+=val*2;
        }
        System.out.println(result);
        result=numbers.stream()
                .filter(value->value%2==0)
                .mapToInt(value -> value*2)
                .sum();
        System.out.println(result);
        /*numbers.stream()
                //.map(String::valueOf)
                //.map(element->String.valueOf(element))
                .mapToDouble(element->element)
                .forEach(System.out::println);

         */
        int res=numbers.stream()
                        .reduce(0,Integer::sum);
                        //.reduce(0,(total,element)->Integer.sum(total,element));
        String res1=numbers.stream()
                            .map(String::valueOf)
                            .reduce("",(concat,element)->concat.concat(element));
        System.out.println(res1);

       // List<Integer> doubleOfEven=new ArrayList<Integer>();
        //numbers.stream()
          //      .filter(element->element%2==0)
            //    .map(element->element*2)
              //  .forEach(element->doubleOfEven.add(element));
        //System.out.println(doubleOfEven);
        List<Integer> doubleOfEven ;
        doubleOfEven=numbers.stream()
                .filter(element->element%2==0)
                .map(element->element*2)
                .collect(Collectors.toList());
        System.out.println(doubleOfEven);

    }
}
