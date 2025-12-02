package basics;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = k++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[3][];
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];
        k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr2[i][j] = k++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr3 = {{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
