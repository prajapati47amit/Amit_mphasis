package com.mphasis.main.cui;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationRemote extends Remote {
    public boolean validateCredentials(String username, String password) throws RemoteException;
}
