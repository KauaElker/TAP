/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author aluno
 */
public class Ponto2D implements objeto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Ponto2D(" + "x=" + x + ", y=" + y + ')';
    }

    @Override
    public void moveX(double dX) {
        x=x + dX;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveY(double dY) {
        y=y + dY
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveXY(double dX, double dY) {
        x+=dX
        y+=dY
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
}
