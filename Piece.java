/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessgame;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Piece {
    Position position;
    
    public boolean isValidMove(Position newPosition){
        if(newPosition.getRow()>=0 && newPosition.getColumn()>=0
            && newPosition.getRow()<8 && newPosition.getColumn()<8){
            return true;}
        else{
            return false;}
    }
    
    public boolean firstPosition (Position newPosition){
        if(newPosition.getRow()>=0 && newPosition.getColumn()>=0
            && newPosition.getRow()<8 && newPosition.getColumn()<8){
            return true;}
        else{
            return false;}
    }
  
    public void move(Position position){
        if (this.isValidMove(position)){
            this.position.tukerRow(position.getRow());
            this.position.tukerColumn(position.getColumn());
        }
        else {
            System.out.println("Tidak dapat pindah");;
        }
    }
    
    public void aturPosition(Position newPosition){
        if(this.firstPosition(newPosition)){
            this.position = newPosition;
        }
    }
    
    public Position getPosition(){
        return position;
    }
        
}
