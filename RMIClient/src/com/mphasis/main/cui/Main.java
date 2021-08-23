package com.mphasis.main.cui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            AuthenticationRemote authenticationRemote=(AuthenticationRemote)Naming.lookup("rmi://DESKTOP-IAPGCGV/Authentication");
            boolean status=authenticationRemote.validateCredentials("Amit","paa1123");
            System.out.println(status);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
