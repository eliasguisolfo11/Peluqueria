

package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.gui.Principal;


public class Peluqueriacanina {

    public static void main(String[] args) {
        
        Principal mainWindow = new Principal();
        
        //hago visible la pantalla y que no se abra en lugares randoms
        
        mainWindow.setVisible(true);
        mainWindow.setLocationRelativeTo(null);
        
        
        
    }
}
