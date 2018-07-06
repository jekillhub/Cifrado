package com.mycompany.cifrado.funciones;

public class CifradoVigenere {
    
    int[][] tabla;
    
    public CifradoVigenere() {
        
        this.tabla = new int[26][26];
        
    }
    
    public void llenarMatriz(){
    
        for(int i=0;i<this.tabla.length;i++){
        
            for(int j=0;j<this.tabla.length;j++){
            
                this.tabla[i][j] = j%26;
            
            }
        
        }
        
    } 
    
    public static String transformarCharToInt(String texto){
    
        StringBuilder sb = null;
        
        for (int i=0; i<texto.length();i++){
            int num =texto.charAt(i);
            sb.append(num); 
        }
        
     return sb.toString();
     
    } 
    
    public void encode(){
    
        
    
    }
    
}
