import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        String a = "-2-";

        List<String> a1 = new ArrayList<>();
        List<String> a2 = new ArrayList<>();
        List<String> a3 = new ArrayList<>();

        String[] arr = new String[3];
        arr = a.split("-");

        System.out.println("Arrays.toString(arr) => " + Arrays.toString(arr));
        System.out.println("arr.length => " + arr.length);
        System.out.println("arr[0].length() => " + arr[0].length());
        System.out.println("arr[1].length() => " + arr[1].length());
        System.out.println("arr[2].length() => " + arr[2].length());

        if (arr.length == 0) {
            System.out.println("111111111");
        } else {
            System.out.println("222222222");
        }

        System.out.println(arr[0].length());
        System.out.println(arr[1].length());
        System.out.println(arr[2].length());

        a1 = Arrays.asList(arr[0].split("/"));
        a2 = Arrays.asList(arr[1].split("/"));
        a3 = Arrays.asList(arr[2].split("/"));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
