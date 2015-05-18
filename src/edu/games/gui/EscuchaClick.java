package edu.games.gui;

import java.awt.Canvas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EscuchaClick implements
        MouseListener, MouseMotionListener {

    Canvas canvas;
    int juego[][];
    int participante;

    public EscuchaClick(Canvas canvas, int juego[][]) {
        this.canvas = canvas;
        this.juego = juego;
        participante = 0; //siempre empieza en el circulo
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int posX = e.getX();
        int posY = e.getY();
        int x = -1, y = -1;
        try {
            if (posX > 30 && posX < 130) {
                x = obtenBloqueY(posY);
                y = 0;
            } else if (posX > 30 && posX < 230) {
                x = obtenBloqueY(posY);
                y = 1;
            } else if (posX > 30 && posX < 330) {
                x = obtenBloqueY(posY);
                y = 2;
            }
        } catch (Exception w) {
        }
        if (juego[y][x] == -1) {
            juego[y][x] = participante;
            if (participante == 1) {
                participante = 0;
            } else {
                participante = 1;
            }
            canvas.repaint();
        }
    }

    private int obtenBloqueY(int posY) throws Exception {
        if (posY > 20 && posY < 120) {
            return 0;
        } else if (posY > 20 && posY < 230) {
            return 1;
        } else if (posY > 20 && posY < 330) {
            return 2;
        }
        throw new Exception();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    void setCanvaDib(PanelJuego aThis) {
        canvas = aThis;
    }

}
