package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/**
 * A class to handle each client
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */

public class Handler implements Runnable{

    Socket connectionSocket;

    /**
     * Constructor
     * @param connectionSocket socket to connect to
     */
    public Handler(Socket connectionSocket) {
        this.connectionSocket = connectionSocket;
    }

    /**
     * run the process of sending and receiving text for each client
     * @exception IOException server and client can't connect
     */
    @Override
    public void run(){
        try {
            OutputStream out = connectionSocket.getOutputStream();
            InputStream in = connectionSocket.getInputStream();
            String output = "";
            byte[] buffer = new byte[4096];

            while (true) {
                int read = in.read(buffer);
                String input = new String(buffer, 0, read);

                System.out.println("RECV: " + input);
                output += (input + "\t");

                if (input.equals("over"))
                    break;

                out.write(output.getBytes("UTF-8"));
                System.out.println("SENT: " + output);
            }
            System.out.print("All messages sent.\nClosing client ... ");
        } catch (IOException e) {
            System.err.println("Some went Wrong in I/O");
        }
    }
}
