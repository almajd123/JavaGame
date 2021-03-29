public class Java
{




    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            boolean kaOrChing3 = true;
            boolean kaOrChing5 = true;

            if ((i % 3 == 0)&&(i%15!=0)) {
                System.out.println("ka");
                kaOrChing3=false;
            }
            if ((i % 5 == 0) &&(i%15!=0)){
                System.out.println("ching");
                kaOrChing5=false;

            }

            if (i%15==0) {
                System.out.println(String.valueOf("ka-ching!"));

            } else if ((kaOrChing3)&&(kaOrChing5)){
                System.out.println(i);

            }
        }
    }
}
