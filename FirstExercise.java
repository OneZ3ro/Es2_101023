import java.util.*;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi che vuoi inserire");
        int n = Integer.parseInt(input.nextLine());
        List<String> withDuplicate = new ArrayList<>();
        Set<String> noDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci la tua parola");
            String parola = input.nextLine();
            withDuplicate.add(parola);
            noDuplicate.add(parola);
        }

        System.out.print("Parole duplicate: [");
        for (String parola : withDuplicate) {
            System.out.print(parola + ", " + parola + ", ");
        }
        System.out.println("]");

        System.out.println("Numero di parole distinte: " + noDuplicate.size());

        System.out.print("Parole distinte: [");
        for (String parola : noDuplicate) {
            System.out.print(parola + ", ");
        }
        System.out.println("]");

        input.close();
    }
}
