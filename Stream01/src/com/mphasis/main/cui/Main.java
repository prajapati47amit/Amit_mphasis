package com.mphasis.main.cui;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stream<String> nameStream=Stream.of("Mohan","John","Ramji","Amit");
        Stream<String> nameStartJ=nameStream.map(String::toUpperCase)
                                            .(e-> System.out.println(e))
                                            .filter(s->s.startsWith("J"));
        System.out.println("Calling terminal operation: count");
        long count=nameStartJ.count();
        System.out.println("Count: "+count);
    }
}
