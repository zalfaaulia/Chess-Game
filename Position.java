/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessgame;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Position {
    private int row;
    private int column;
    
    Position(int r, int c){
        this.row = r;
        this.column = c;
    }
    
    public int getRow(){ //getter untuk mendapatkan baris
        return this.row;
    }
    
    public int getColumn(){ //getter untuk mendapatkan kolom
        return this.column;
    }
    
    public void tukerRow(int row){ //setter untuk menukar nilai baris
        this.row = row;
    }
    
    public void tukerColumn(int column){ //setter untuk menukar nilai kolom
        this.column = column;
    }
}
