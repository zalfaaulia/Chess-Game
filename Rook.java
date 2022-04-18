/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessgame;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Rook extends Piece{
    
    @Override
    public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(this.getPosition())){
            return false;
        }
        
        if(newPosition.getColumn() == this.getPosition().getColumn() ||
           newPosition.getRow() == this.getPosition().getRow()){
            return true;}
        else{
            return false;}
    
    }
    
}
