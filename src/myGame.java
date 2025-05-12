import java.util.Scanner ;

public class myGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberRandom = (int) (Math.random() * 101);
        boolean win = false;


        for (int i = 1; i < 11; i++) {
            System.out.println("Tentative " + i + " devinez un numéro");
            int grade = scanner.nextInt();
            if (grade > numberRandom) {
                System.out.println("plus grand");
            }
            else if (grade < numberRandom) {
                System.out.println("plus petit");
            }
            else {
                win = true;
                System.out.println("Vous avez gagné le numéro est "+numberRandom);
                break;
            }

        }
        if (!win) {
            System.out.println("Vous avez perdu le numéro etait "+numberRandom);
        }
    }
}
