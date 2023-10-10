import entities.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        HashMap<String, String> usersMap =  new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Quante persone vuoi aggiungere alla rubbrica?");
        int num = Integer.parseInt(input.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Nome");
            String nome = input.nextLine();
            System.out.println("Numero");
            String numero = input.nextLine();
            User user =  new User(nome, numero);
            usersMap.put(user.getNumeroTel(), user.getNome());
            System.out.println(user);
        }
        cancellazione(usersMap, "Gino");
        input.close();
    }

    public static void cancellazione(HashMap<String, String> usersMap, String nome) {
        Collection<String> valori = usersMap.values();
        Iterator<String> i = usersMap.values().iterator();
        while (i.hasNext()) {
            String current = i.next();
            if (current.equals(nome)) {
                i.remove();
            }
        }
        for (String user : valori) {
            System.out.println(user);
        }
    }
}
