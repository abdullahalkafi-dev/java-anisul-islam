package Basic_Java;

public class Java_dataTypes {
    public static void main(String[] args) {
        int storage = 128;  // int = 4 bytes
        long serialNumber = 132346789033330L;  // long = 8 bytes
        float price = 1199.99f; // float = 4 bytes
        double screenSize = 6.3; // double = 8 bytes
        boolean hasFaceId = true; // boolean = 1 bits
        char modelCode = 'A'; // char = 2 bytes
        System.out.println("iPhone Model Code: " + modelCode);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Price: $" + price);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Face ID Available? " + hasFaceId);
    }
}
