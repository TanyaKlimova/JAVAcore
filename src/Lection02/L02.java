package Lection02;

public class L02 {
    public static void main(String[] args) {
        String[][] b = new String[4][4];
        b[0][0] = "1";
        b[1][0] = "2";
        b[2][0] = "22";
        b[3][0] = "55";
        b[0][1] = "7";
        b[1][1] = "15";
        b[2][1] = "93";
        b[3][1] = "9";
        b[0][2] = "66";
        b[1][2] = "11";
        b[2][2] = "33";
        b[3][2] = "38";
        b[0][3] = "3";
        b[1][3] = "40";
        b[2][3] = "83";
        b[3][3] = "23";

        l2(b);
    }

    public static void l2(String[][] a) {
        if (a.length > 4)
            throw new MyArraySizeException();

        for (int i = 0; i < a.length; i++) {
            if (a[i].length > 4)
                throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
                try {
                    int u = Integer.parseInt(a[i][j].trim());
                    sum = sum + u;
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException();
                }
            }
            System.out.println(" ");
        }

        System.out.println("sum = " + sum);
    }
}