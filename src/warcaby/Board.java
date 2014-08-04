/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warcaby;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Piotr
 */
public class Board extends Rectangle {
    protected boolean type;
    private boolean taken = false;
    protected Color color;
    public Board(){}
    public Board(boolean type,int x,int y,int w,int h){
        this.setBounds(x, y, w, h);
        this.type = type;
        setColor();
    }
    public void setType(boolean type){
        this.type=type;
    }
    public boolean getType(){
       return type;
    }
    public void setColor(){
        if(type){
            color = new Color(240,240,230);
        } else color = new Color(139,69,19);
    }

    public Color getColor() {
        return color;
    }
    public void draw(Graphics g){
        g.setColor(getColor());
        g.fillRect(x, y, WarcabyPanel.boardPaneWidth, WarcabyPanel.boardPaneHeight);
        if( WarcabyPanel.debug){
            g.setColor(Color.red);
            g.drawString(new String(x+","+y), x, y);
        }
    }
}
