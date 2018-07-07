package com.mycompany.cifrado.funciones;

public class CifradoVigenere {
    
    public static String encode(String texto, String clave){
    
        StringBuilder codificado = new StringBuilder();
        
        for(int i=0; i<texto.length();i++){
        
            int letraTexto = (int) texto.charAt(i) - 97;            
            int letraClave = (int) clave.charAt(i) - 97;            
            int letraCD = (letraTexto + letraClave) % 26;           
            codificado.append(Character.toString((char) (letraCD + 97)));
            
        }
        
        return codificado.toString();
    
    }
    
    public static String decode(String texto, String clave){
    
        StringBuilder decodificado = new StringBuilder();
        
        for(int i=0; i<texto.length();i++){
        
            int letraTexto = (int) texto.charAt(i) - 97;
            int letraClave = (int) clave.charAt(i) - 97;
            int letraDC = 0;
            
            if((letraTexto - letraClave) < 0){
                
                letraDC = (letraTexto - letraClave + 26) % 26;
                
            }
            else{
            
                letraDC = (letraTexto - letraClave) % 26;
            
            }
            
            decodificado.append(Character.toString((char) (letraDC + 97)));
                        
        }
        
        return decodificado.toString();
    
    }
    
}
