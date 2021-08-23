package com.mphasis.main.cui;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AuthenticationRemoteImpl extends UnicastRemoteObject implements AuthenticationRemote {
    public AuthenticationRemoteImpl() throws RemoteException{

    }

    @Override
    public boolean validateCredentials(String username, String password) throws RemoteException {
        if (username.equalsIgnoreCase("Amit") && password.equals("paa1123"))
            return true;
        return false;
    }
}
