package niebla.abraham.mastermind;
import java.awt.Color;
import java.awt.Graphics2D;

/**Crea un cuadrado que servirá como ficha
 * Lo dibuja en canvas
 * @author (Ramírez Niebla Jesús Abraham) 
 * @version (2 04.12.2022)*/
public class Ficha
{
    private int alto, ancho;
    private int x, y;
    private Color color;
    private Canvas canvas;

    /**Constructor de objetos de la clase Ficha*/
    public Ficha(int x, int y, int alto, int ancho, Canvas canvas, Color color)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
        this.canvas = canvas;
        setColor(color);
        canvas.fillRectangle(x, y, ancho, alto);
    }
    
    /**Cambia el color de la ficha*/
    public void setColor(Color color)
    {
        Graphics2D graphic = canvas.getGraphic();
        graphic.setColor(color);
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setAlto(int alto)
    {
        this.alto = alto;
    }
    
    public int getAlto()
    {
        return alto;
    }
    
    public void setAncho(int ancho)
    {
        this.ancho = ancho;
    }
    
    public int getAncho()
    {
        return ancho;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getY()
    {
        return y;
    }
}