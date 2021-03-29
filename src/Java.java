public class Java

{    public static void main(String[] args) {
    for (int i = 1; i <= 30; i++) {
        boolean kaOrChing = false;
        if (i % 3 == 0) {
            System.out.print("ka-");
            kaOrChing = true;
        }
        if (i % 5 == 0) {
            System.out.print("ching");
            kaOrChing = true;
        }

        if (kaOrChing) {
            System.out.println();
        } else {
            System.out.println(String.valueOf(i));
        }
    }
}
}
