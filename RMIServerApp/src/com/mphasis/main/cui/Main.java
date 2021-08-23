package com.mphasis.main.cui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            AuthenticationRemoteImpl authenticationRemote=new AuthenticationRemoteImpl();
            Naming.rebind("rmi:///Authentication",authenticationRemote);
            System.out.println("Remote Object Registered...");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
