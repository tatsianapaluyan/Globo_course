package lection1.com.globoforce.homework;

public class ArrayExample {
    public static void main(String[] args) {

        String s = "Globoforce";
        char[] glob = s.toCharArray();
        System.out.println("Array length: " + glob.length);

        for (int i = 0; i < glob.length; i++) {

            if (glob[i] == 'b') {
                glob[i] = '$';
                System.out.println("Find an element to change: " + i);
            }
        }
        System.out.println("\nChange b to $:");
        System.out.println(glob);
    }
}
