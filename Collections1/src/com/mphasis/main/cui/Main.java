package com.mphasis.main.cui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,Integer> paymentDetails=new HashMap<String,Integer>();
        paymentDetails.put("RamJi",100);
        paymentDetails.put("Sahu",200);
        paymentDetails.put("Pranshul",300);
        paymentDetails.put("Sandesh",100);
        Integer salary=paymentDetails.get("RamJi");
        System.out.println(salary);
        Set<Map.Entry<String,Integer>> allPaymentDetails=paymentDetails.entrySet();
        for (Map.Entry<String,Integer> entryDetails:allPaymentDetails)
            System.out.println(entryDetails.getKey()+"...."+entryDetails.getValue());


        /*Iterator<Map.Entry<String, Integer>> iterator =allPaymentDetails.iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> keyValue= iterator.next();
            System.out.println("key is: "+ keyValue.getValue()+"value is: " +keyValue.getValue());
        }

         */
    }
}
