package com.mphasis.main.cui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args){
        Socket socket= null;
        try {
            socket=new Socket("DESKTOP-IAPGCGV",5678);
            System.out.println("Connected to Server");

            InputStream inputStream= socket.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*finally {
            if(socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

         */
        System.out.println("Closed");
    }
}
