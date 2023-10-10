import java.util.*;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi che vuoi creare");
        int n = Integer.parseInt(input.nextLine());
        List<Integer> arrNumbs = new LinkedList<>();
        Set<Integer> sorted = new TreeSet<>();

        //********************* Prima parte *********************
        for (int i = 0; i < n; i++) {
            Random rndm = new Random();
            sorted.add(rndm.nextInt(1, 100));
        }
        for (Integer num : sorted) {
            arrNumbs.add(num);
        }
        System.out.print("Numeri casuali: [");
        for (Integer num : arrNumbs) {
            System.out.print(num + ", ");
        }
        System.out.println("]");

        //********************* Seconda parte *********************
        for (int i = 0; i < n; i++) {
            arrNumbs.add(n, arrNumbs.get(i));
        }
        System.out.print("Numeri casuali avanti e indietro: [");
        for (Integer num : arrNumbs) {
            System.out.print(num + ", ");
        }
        System.out.println("]");

        //********************* Terza parte *********************
        terzo(arrNumbs, false, n);

        input.close();
    }

    public static void terzo(List<Integer> list, boolean bool, int n) {
        if (bool) {
            System.out.print("Terza funzione: [");
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(list.get(i) + ", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.print("Terza funzione: [");
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    System.out.print(list.get(i) + ", ");
                }
            }
            System.out.println("]");
        }
    }

}
