package Prak10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author USER-PC
 */

public class Latihan1 {
    public static void main(String[] args) throws IOException {
        String content = new Scanner(new File("D:\\Kuliah Semester 4\\Alpro 3\\PRAK\\10\\Prak10\\example.txt")).useDelimiter("\\Z").next();
            System.out.println(content);

            Scanner in = new Scanner(System.in);
            System.out.println("\nKata apa yang ingin dicari ? ");
            String letter = in.next();

            System.out.println("\nJumlah kata" + letter + " adalah " + count(content, letter));
        }
    public static int count(String str, String ltr) {
        if (str.length() < 2) {
            return 0;
        } else if (str.substring(0, 1).equalsIgnoreCase(ltr)) {
            return 1 + count(str.substring(1), ltr);
        } else {
            return count(str.substring(1), ltr);
        }
    }
}
