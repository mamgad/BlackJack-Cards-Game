/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black.jack.game;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Mohamed Amgad
 */
public class Card {
 
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Card(int num) throws IOException {
        this.num=num;
        loc = (int)(num+1)+".png";
        String temp=BlackJackGame.WD.replace("\\", "/")+"src/Images/";
        
        System.out.println(BlackJackGame.WD.replace("\\", "/")+"src/images/"+loc);
        
           img = ImageIO.read(new File(temp+loc));
    }
    String loc;
    int val=0;
    int num;
    BufferedImage img;
    
    
}
