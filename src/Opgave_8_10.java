import java.util.Random;

public class Opgave_8_10 {

    public static void main(String[] args) {


        // Laver et 5 * 5 array af datatypen int
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Laver et random objekt af klassen Random
                Random random = new Random();

                // Gemmer et tal mellem 0 og 1 i matrix arrayet
                matrix[i][j] = random.nextInt(2);

                // Udskriver tallet i matrix
                System.out.print(matrix[i][j]);

            }
            // Laver en ny linje
            System.out.println();
        }

        int maxRow = 0;
        int indexOfMaxRow = 0;

        // Får summen af den første række og gemmer den i maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow = maxRow + matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow = totalOfThisRow + matrix[row][column];
            }

            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        System.out.println("The largest row index: " + indexOfMaxRow);

        int maxColumn = 0;
        int indexOfMaxColumn = 0;

        // Får summen af den første column og gemmer den i maxColumn
        for (int row = 0; row < matrix.length; row++) {
            maxColumn = maxColumn + matrix[row][0];
        }

        for (int column = 1; column < matrix[0].length; column++) {
            int totalOfThisColumn = 0;
            for (int row = 0; row < matrix.length; row++) {
                totalOfThisColumn = totalOfThisColumn + matrix[row][column];
            }

            if (totalOfThisColumn > maxColumn) {
                maxColumn = totalOfThisColumn;
                indexOfMaxColumn = column;
            }
        }

        System.out.println("The largest column index: " + indexOfMaxColumn);

    }
}
