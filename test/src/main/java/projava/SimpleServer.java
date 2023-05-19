package main.java.projava;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class SimpleServer {
    public static void main(String[] args) throws IOException{
        var server = new ServerSocket(1600);
        System.out.println("Waiting...");
        try (Socket soc = server.accept();
        InputStream input = soc.getInputStream()){
            System.out.println("connect from" + soc.getInetAddress());
            System.out.println(input.read());
        }
    }
}
