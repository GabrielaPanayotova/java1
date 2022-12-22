import java.io.*;

public class Array2D {

    public static void main(String[] args)  throws java.io.IOException {

        File file = new File("results.txt");
        File file1 = new File("results1.txt");
        File file2 = new File("results2.txt");
        int i = 0;
        int[][][] xyz = {
                {{98, 17, 54}, {14, 21, 1}, {15, 17, 20}},
                {{5, 14, 21}, {11, 15, 17}, {38, 24, 81}},
                {{0, 11, 15}, {30, 18, 24}, {66, 70, 99}}
        };

        //for (int[] []item : xyz) {
        //for (int[] item1 : item) {

        // for (int item2 : item1) {

        //System.out.print(" " + item2);
        //}
        //}

        if (file.exists() && file1.exists() && file2.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        for (int[][] item : xyz) {

            for (int[] item1 : item) {

                for (int item2 : item1) {

                    output.print(" " + item2);
                    i++;
                    if (i % 9 == 0) {
                        output.println();
                    }
                }
            }
        }
        output.close();
    }
}

