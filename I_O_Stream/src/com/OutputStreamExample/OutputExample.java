
package com.OutputStreamExample;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputExample {
    public static void main(String args[]) {
        String data = "This is a line of text inside the file.";

        try {
            // Create an OutputStream by opening a FileOutputStream for the specified file
            OutputStream out = new FileOutputStream("output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}