package com.mphasis.main.cui;

import com.mphasis.types.Month;
import static com.mphasis.types.Month.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Month month;
        month=Month.FEB;
        if(month==Month.FEB)
            System.out.println("Feb it is");
        if(month==FEB)
            System.out.println("Static import feb"); //using static import
        Month[] months=Month.values();
        for (Month month1:months)
            System.out.println(month1);
        Month currentMonth = Month.valueOf("JAN");
        if (currentMonth==Month.JAN)
            System.out.println("January it is");
    }
}
