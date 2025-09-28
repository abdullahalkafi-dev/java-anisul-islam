package Basic_Java;

public class Java_string_split {
    public static void main(String[] args) {
        String name = "Abdullah Al     Kafi";
        String a[] = name.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
