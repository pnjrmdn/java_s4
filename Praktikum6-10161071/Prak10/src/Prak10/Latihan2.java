package Prak10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 *
 * @author USER-PC
 */

public class Latihan2 {

    public static void cat(File File) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(File, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException notFound) {
            System.err.format("File: & not found", File);
        } catch (IOException e) {
            System.err.format(e.toString());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException io) {
                }
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("d:\\example.txt");
        cat(file);
    }
}
