package com.mycompany.cifrado.funciones;

public class CifradoCesar {

    public String encode(String texto, int k) {

        StringBuilder codificado = new StringBuilder();
        int numLetraSC = 0;
        int numLetraCD = 0;

        for (int i = 0; i < texto.length(); i++) {

            numLetraSC = (int) texto.charAt(i) - 97;
            numLetraCD = (numLetraSC + k) % 26;
            codificado.append(Character.toString((char) (numLetraCD + 97)));

        }

        return codificado.toString();

    }

    public String decode(String texto, int k) {

        StringBuilder decodificado = new StringBuilder();
        int numLetraSC = 0;
        int numLetraCD = 0;

        for (int i = 0; i < texto.length(); i++) {

            numLetraSC = ((int) texto.charAt(i)) - 97;
            numLetraCD = (numLetraSC - k) % 26;
            decodificado.append(Character.toString((char) (numLetraCD + 97)));
           
        }

        return decodificado.toString();

    }

}
