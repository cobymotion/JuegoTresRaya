package edu.games.gui;

import java.awt.Canvas;
import java.awt.Graphics;

public class PanelJuego extends Canvas {
 
    int juego[][]; 

    public PanelJuego(int[][] juego) {
        this.juego = juego;
    }        
    
    
    @Override
    public void paint(Graphics lapiz)
    {
        ///Aqui va nuestra matriz
        /// panel del juego
        lapiz.clearRect(0, 0, 400, 400);
        lapiz.fillRect(130, 20, 10, 320);
        lapiz.fillRect(240, 20, 10, 320);
        lapiz.fillRect(30, 120, 320, 10);
        lapiz.fillRect(30, 230, 320, 10);        
        // dibujar 
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)            
                if(juego[i][j]!=-1)
                    dibujaFigura(i,j,juego[i][j],lapiz);  
        ////AQUI PONER SU VALIDACION PARA VALIDAR QUIEN GANO
    }

    private void dibujaFigura(int i, int j, int figura, Graphics g) {
        if(figura==0)
          g.drawArc(50+(i*115), 40+(j*115), 50, 50, 0, 360);
        else {
          g.drawLine(50+(i*115), 40+(j*115), 100+(i*115), 90+(j*115));
          g.drawLine(50+(i*115), 90+(j*115), 100+(i*115), 40+(j*115));
        }
    }
    
}
