//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un digito:");
        String texto = sc.nextLine();
        if( texto.length() <= 10 ) {
            String TextoEncriptado = EncriptarSHA1(texto);
            System.out.println(TextoEncriptado);
        }
        else {
            System.out.println("La cadena supera los caracteres permitidos");
        }
    }

    public static String EncriptarSHA1(String texto) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-1");
            byte[] jash = dig.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : jash) {
                hexString.append(String.format("%02x", b));
            }
            return EncriptarSHA256(hexString.toString()).toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }

    public static String EncriptarSHA256(String texto) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            byte[] jash = dig.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : jash) {
                hexString.append(String.format("%02x", b));
            }
            return EncriptarSHA512(hexString.toString()).toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }

    public static String EncriptarSHA512(String texto) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-512");
            byte[] jash = dig.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : jash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }
}