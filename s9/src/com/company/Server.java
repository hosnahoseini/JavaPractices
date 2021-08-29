package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * notepad Server class
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */

public class Server {
    /**
     * Main method to run server
     *
     * @param args
     * @exception IOException server and client can't connect
     */

    public static void main(String[] args) {

        System.out.println("Server started.\nWaiting for a client ... ");
        ExecutorService pool = Executors.newCachedThreadPool();

        try (ServerSocket welcomingSocket = new ServerSocket(7568)) {

            while (true) {
                Socket connectionSocket = welcomingSocket.accept();
                System.out.println("client accepted!");
                pool.execute(new Thread(new Handler(connectionSocket), "Handler Thread"));
            }

        } catch (IOException ex) {
            System.err.println("Some went Wrong in I/O");
        }

        System.out.print("done.\nClosing server ... ");
        System.out.println("done.");

    }

}
