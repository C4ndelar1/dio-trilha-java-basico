package org.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();

        System.out.println("instancia1 e instancia2 fazem parte da mesma instância?");

        if (instancia1 == instancia2){
            System.out.println("São da mesma instância");
            } else {
            System.out.println("Não são da mesma instância");
        }
        instancia1.mensagem();
        instancia2.mensagem();
    }
}