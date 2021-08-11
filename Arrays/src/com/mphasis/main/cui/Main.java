package com.mphasis.main.cui;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[][] nums;
        //nums=new int[5][3];
        //nums[2][1]=3;
        //nums[4][1]=8;
        //for(int[] num:nums){
          //  for(int n:num) {
           //     System.out.print(n+" ");

            //}
            //System.out.println();
        Point[] points;
        points=new Point[5];
        points[2]=new Point(2,4);
        points[4]=new Point(3,6);
        for(Point point:points){
            System.out.println(point);
        }




        }
}

