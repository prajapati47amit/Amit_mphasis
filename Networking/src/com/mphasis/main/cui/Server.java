package com.mphasis.main.cui;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	// write your code here
        ServerSocket serverSocket=null;
        Socket socket=null;
        try {
            serverSocket=new ServerSocket(5678);
            System.out.println("Server Started....");

            while (true){
                socket=serverSocket.accept();
                System.out.println("client connected");
                System.out.println(socket.getInetAddress());

                OutputStream outputStream=socket.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
                bufferedWriter.write("writing\n");

                bufferedWriter.flush();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
