package org.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new  Singleton();
        }
        return instance;
    }

    public void mensagem(){
        System.out.println("Instância de Singleton.");
    }
}
