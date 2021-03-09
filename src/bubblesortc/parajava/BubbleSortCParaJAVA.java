/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortc.parajava;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Escola
 */
public class BubbleSortCParaJAVA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 
        
        System.out.println("Insira número para formar o vetor!");
        
        ArrayList<Integer> lista = new ArrayList<>();
       
        while(true){ 
            System.out.println("\n(Digite 'parar' para terminar)\nInforme um número: ");
            String input = sc.next();

            if(input.endsWith("parar"))
                break;
            
            lista.add(Integer.parseInt(input));
            
       }
        
        while(true){
            
            boolean trocou = false;
            
            for(int i = 0; i < lista.size()-1; i++){              
                if(lista.get(i) > lista.get(i+1)){
                    int troca = lista.get(i+1);
                    lista.set(i+1, lista.get(i)); 
                    lista.set(i, troca); 
                    trocou = true;
                }
            }
            
            if(!trocou)
                break;
        }
        
        String texto = "";
        
        for(int i = 0; i < lista.size(); i++){
            
            texto = texto.concat(lista.get(i).toString());
            
            if(i != lista.size()-1)
                texto = texto.concat(", ");
        }
        
        System.out.println("O vetor foi ordernado!\n[ " + texto + " ]");
    }
    
}