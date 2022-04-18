/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chessgame;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rook benteng = new Rook();
        Position posisi1 = new Position(4,5);
        Position posisi2 = new Position(4,4);

        if (benteng.firstPosition(posisi1)){
            benteng.aturPosition(posisi1);}
        else {
            System.out.println("Tidak dapat pindah! Posisi tidak valid silakan ganti posisi!");}
        
        benteng.move(posisi2);
        
        System.out.println("Posisi buah catur saat ini : "+ benteng.getPosition().getRow()+" "+ benteng.getPosition().getColumn());
    }
}
    
