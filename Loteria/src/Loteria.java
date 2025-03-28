import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        int randomNumber = 0;
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        ArrayList<Integer> userNumbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int rightGuesses = 0;

       for(int i = 0; i < 6; i++) {
            randomNumber = (int) (Math.random() * 61) + 1;
            randomNumbers.add(randomNumber);

           System.out.print(String.format("Insira um número(%d/6)", i + 1));
           userNumbers.add(sc.nextInt());
        }

       sc.close();

        Collections.sort(randomNumbers);
        Collections.sort(userNumbers);

       for(int i = 0; i < randomNumbers.size(); i++) {
           int currentRandom = randomNumbers.get(i);

           for(int j = 0; j < userNumbers.size(); j++) {
               if(currentRandom == userNumbers.get(j)) {
                   rightGuesses++;
                   userNumbers.remove(j);
               }
           }
       }

       System.out.println(String.format("Você teve %d acertos.", rightGuesses));
    }
}
