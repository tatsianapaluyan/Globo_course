package lection_1.com.globoforce.homework;

public class PrimitiveTypesExample {

    public static void main(String[] args) {
        String s1 = "We make work HUMAN.\n";
        String s2 = "Unlock full potential. Celebrate positive moments.\n";
        String s3 = "Every day.\n";

        String A = ("Present a text:\n" + s1 + s2 + s3 + "\n");
        String B = ("Length of the 2 string:\n" + s2.length() + "\n");
        String C = ("Lower case:\n" + s1.toLowerCase() + s2.toLowerCase() + s3.toLowerCase() + "\n");
        String E = ("Lower case:\n" + (s1 + s2 + s3).toLowerCase());
        String D = ("Change e to E:\n" + s1.replace('e', 'E') + s2.replace('e', 'E') + s3.replace('e', 'E') + "\n");
        String F = ("Change e to E:\n" + (s1 + s2 + s3).replace('e', 'E'));

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}

