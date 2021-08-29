package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
     */

    public static void main(String[] args) {

        System.out.print("Server started.\nWaiting for a client ... ");

        try (ServerSocket welcomingSocket = new ServerSocket(7657);
             Socket connectionSocket = welcomingSocket.accept();
             OutputStream out = connectionSocket.getOutputStream();
             InputStream in = connectionSocket.getInputStream()) {

            System.out.println("client accepted!");

            String output = "";
            byte[] buffer = new byte[4096];


            while (true) {
                int read = in.read(buffer);
                String input = new String(buffer, 0, read);

                System.out.println("RECV: " + input);
                output += (input + "\t");

                if (input.equals("over"))
                    break;
                Thread.sleep(3000);
                out.write(output.getBytes("UTF-8"));
                System.out.println("SENT: " + output);
            }
            System.out.print("All messages sent.\nClosing client ... ");
        } catch (IOException ex) {
            System.err.println("Some went Wrong in I/O");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("done.\nClosing server ... ");
        System.out.println("done.");
    }

}
