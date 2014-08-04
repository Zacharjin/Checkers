/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warcaby;

import java.awt.Graphics;


public class Player {
    Piece[] piece = new Piece[12];
    boolean type;
    public Player(){}
    public Player(boolean type){
        int counter=0;
        if(type){
            counter =0;
        }else counter =1;
        this.type=type;
        int offset=5*WarcabyPanel.boardPaneHeight;
        if(!type){
            offset=0;
        }
        for (int y = offset,i=0; y < offset+3*WarcabyPanel.boardPaneHeight; y+=WarcabyPanel.boardPaneHeight) {
            for (int x = 0 + WarcabyPanel.boardPaneWidth*counter; x <WarcabyPanel.boardWidth&&i<piece.length; x+=2*WarcabyPanel.boardPaneWidth,i++) {
                piece[i] =  new Piece(type,x,y,WarcabyPanel.boardPaneWidth,WarcabyPanel.boardPaneHeight);    
            }
            counter++;
            counter%=2;
        }
    }
    public void draw(Graphics g){
        int i =0;
        for(Piece p: piece){
            if(p !=null){
                p.draw(g);
            }      
        }
    }
    public String toString(){
        return type?"Gracz biały":"Gracz czarny";
    }
}
