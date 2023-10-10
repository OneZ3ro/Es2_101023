import entities.User;

import java.util.*;

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
            usersMap.put(user.getNome(), user.getNumeroTel());
            System.out.println(user);
        }
        cancellazione(usersMap, "Gino");
        cercaPersona(usersMap, "12345");
        cercaNumero(usersMap, "Truck");
        input.close();
    }

    public static void cancellazione(HashMap<String, String> usersMap, String nome) {
        System.out.println("Persone non cancellate....");
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

    public static void cercaPersona(HashMap<String, String> usersMap, String numeroTel) {
        System.out.println("Persona corrispondente....");
        Set<String> chiavi = usersMap.keySet();
        for (String chiave : chiavi) {
            if (chiave.equals(numeroTel)) {
                System.out.println(usersMap.get(chiave));
            }
        }
    }

    public static void cercaNumero(HashMap<String, String> usersMap, String nome){
        String numero = usersMap.get(nome);
        System.out.println("Il numero cercato da " + nome + " è: " + numero);
    }

}
