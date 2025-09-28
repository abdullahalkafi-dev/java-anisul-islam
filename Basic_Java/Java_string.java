package Basic_Java;

public class Java_string {
    public static void main(String[] args) {
        String name = "Abdullah Al Kafi";
        String company=new String("Join Venture AI");
        int sizeOfName = name.length();
         String nameInUppercase=  name.toUpperCase();
        System.out.println(name);
        System.out.println(nameInUppercase);
        System.out.println(company);
        System.out.println("Size of name is : " + sizeOfName);
    }
}
