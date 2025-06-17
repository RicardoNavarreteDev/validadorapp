package com.equipo.validador;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String usuario = System.getenv("APP_USER");
        if ("admin".equals(usuario)){
             System.out.println("Bienvendio Administrador!");
        }
    }
}
