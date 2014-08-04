/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warcaby;

import java.awt.Graphics;

/**
 *
 * @author Piotr
 */
public interface Game {
    public void drawBoard(Graphics g);
    public void drawPieces(Graphics g,Player p);

}
