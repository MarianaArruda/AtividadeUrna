/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna;

import java.util.Scanner;

public class Urna {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número total de eleitores: ");
        int total = s.nextInt();
        System.out.println("Digite o total de votos válidos: ");
        int validos = s.nextInt();
        System.out.println("Digite o total de votos brancos: ");
        int brancos = s.nextInt();
        System.out.println("Digite o total de votos nulos: ");
        int nulos = s.nextInt();
        System.out.println("Porcentagem de válidos: " + (validos*100) / total + "%");
        System.out.println("Porcentagem de brancos: " + (brancos*100) / total + "%");
        System.out.println("Porcentagem de nulos: " + (nulos*100) / total + "%");
    }
    
}
