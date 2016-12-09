/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black.jack.game;

import java.io.IOException;

/**
 *
 * @author Mohamed Amgad
 */
public class BlackJackGame {
static Card [] Cards ;
   static String WD;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        WD=System.getProperty("user.dir")+"\\";
        System.out.println(WD);
    Cards = new Card[52];
    for (int i = 0;i<52;i++){
       
      Cards[i]= new Card(i); 
      System.out.println(Cards[i].getNum() +"  "+Cards[i].getLoc());
    }
    Cards[0].setLoc("aaaa");
        //System.out.println(Cards[2].getNum()); 
        
        Frame f = new Frame();
        f.setVisible(true);
        
    }
   
    
}
