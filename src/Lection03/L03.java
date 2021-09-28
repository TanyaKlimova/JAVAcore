package Lection03;

public class L03 {
    public static void main(String [] args) {
        String[] arr = {"asd", "ds", "ret", "123"};
        l3(arr);
    }

    public static void l3(String [] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        String tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;

        System.out.println(" ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
