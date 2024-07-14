import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for Pascal's Triangle: ");
        int rowCount = scanner.nextInt();
        scanner.close();
        printPascalTriangle(generatePascalTriangle(rowCount));
    }

    public static List<List<Integer>> generatePascalTriangle(int rowCount) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int rowNum = 0; rowNum < rowCount; rowNum++) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i <= rowNum; i++) {
                if (i == 0 || i == rowNum) {
                    row.add(1);
                } else {
                    row.add(triangle.get(rowNum - 1).get(i - 1) + triangle.get(rowNum - 1).get(i));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void printPascalTriangle(List<List<Integer>> triangle) {
        int numRows = triangle.size();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = triangle.get(i);
            int numSpaces = numRows - i - 1;
            for (int j = 0; j < numSpaces * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j));
                if (j < row.size() - 1) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}