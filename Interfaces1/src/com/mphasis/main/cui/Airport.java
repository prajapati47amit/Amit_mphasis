package com.mphasis.main.cui;

import com.mphasis.fly.Flyer;
import com.mphasis.fly.Helicopter;
import com.mphasis.fly.SeaPlane;

public class Airport {

    public static void main(String[] args) {
	// write your code here
        Airport metropolisAirport = new Airport();
        Helicopter copter = new Helicopter();
        SeaPlane splane=new SeaPlane();
        metropolisAirport.givePermissionToLand(copter);
        metropolisAirport.givePermissionToLand(splane);

    }
    private void givePermissionToLand(Flyer f){
        f.land();
    }
}
