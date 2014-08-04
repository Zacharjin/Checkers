/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warcaby;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author Piotr
 */
public class Piece extends Board{
    public Piece(boolean type,int x,int y,int w,int h){
        super(type,x,y,w,h);
    }
    
    @Override
    //TRUE BIALY //FALSE CZARNY
    public void setColor(){
        if(type){
            color = new Color(218,165,32);
        } else color = Color.black;
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.fillOval(x+4, y+4, WarcabyPanel.boardPaneWidth-8, WarcabyPanel.boardPaneHeight-8);
        if(type){
            g.setColor(new Color(238,221,130));
        }else g.setColor(new Color(105,105,105));
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(x+4, y+4, WarcabyPanel.boardPaneWidth-8, WarcabyPanel.boardPaneHeight-8);
        if(WarcabyPanel.selected.equals(this)){
           g.setColor(Color.red);
           g.drawRect(x,y, width, height);
        }
        if( WarcabyPanel.debug){
            if(type){
                g.setColor(Color.GREEN);
            }else g.setColor(Color.red);
            g.drawString(new String(type+""), x+ WarcabyPanel.boardPaneWidth/3, y+ WarcabyPanel.boardPaneHeight/3);
        }
    }
    
    @Override
    public String toString(){
        return " Type: "+type+" x: "+x+" y: "+y;
    }
}
