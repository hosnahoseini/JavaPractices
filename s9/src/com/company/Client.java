package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;
/**
 * notepad client class
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */
public class Client {
    /**
     * Main method to run client
     * @param args
     */
    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.1", 7568);
             OutputStream out = client.getOutputStream();
             InputStream in = client.getInputStream()) {

            System.out.println("Connected to server.");
            byte[] buffer = new byte[4096];

            while (true) {
                System.out.println("Enter your text:");
                Scanner scanner = new Scanner(System.in);
                String output = scanner.next();
                out.write(output.getBytes("UTF-8"));
                System.out.println("SENT: " + output);

                if (output.equals("over"))
                    break;

                int read = in.read(buffer);
                String input = new String(buffer, 0, read);
                System.out.println("RECV: " + input);
            }
            System.out.print("All messages sent.\nClosing ... ");
        } catch (IllegalArgumentException e) {
            System.err.println("Some went Wrong in Client starting");
        } catch (ConnectException e) {
            System.err.println("Couldn't connect to Server");
        } catch (SocketException e) {
            System.err.println("Server Not Responding");
        } catch (IOException e) {
            System.err.println("Some went Wrong in I/O");
        }
        System.out.println("done.");
    }
}
