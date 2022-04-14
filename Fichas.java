package niebla.abraham.mastermind;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics2D;

/**Crea los cuadrados que servirán como casillas para las fichas que introduciremos
 * Los dibuja en canvas
 * @author (Ramírez Niebla Jesús Abraham) 
 * @version (2 04.12.2022)*/
public class Fichas
{
    // instance variables - replace the example below with your own
    private Canvas canvas;
    private ArrayList<Ficha> Fichas;
    private Color color;
    private int x;
    private int y;
    private int tamano;

    /**Constructor de objetos de la clase Fichas*/
    public Fichas()
    {
        Fichas = new ArrayList();
    }
     
    /**Dibuja los rectangulos de la palabra en canvas*/
    public void dibujarFichas(Color color)
    {
        int inicioX = 150;
        x = inicioX;
        y = 640;
        tamano = 50;
        int separacion = 60;
        for (int i = 0; i < 60; i++)
        {
            Fichas.add(new Ficha(x, y, tamano, tamano, canvas, color));
            x += separacion;
            if ((i + 1) % 6 == 0)
            {
                x = inicioX;
                y -= separacion;
            }
        }
    }
    
    /**Cambia el color de un rectangulo y refleja el cambio en canvas*/
    public void setFicha(int i, Color color)
    {
        Fichas.set(i, new Ficha(Fichas.get(i).getX(), Fichas.get(i).getY(), 50, 50, canvas, color));
    }
    
    /**Define un color para los rectangulos*/
    public void setColor(Color color)
    {
        Graphics2D graphic = canvas.getGraphic();
        graphic.setColor(color);
    }
    
    /**Obtiene el color de un rectangulo*/
    public Color getColor(int i)
    {
        Fichas.get(i).getColor();
        return color;
    }
    
    /**Obtiene el canvas*/
    public Canvas getCanvas()
    {
        return canvas;
    }
    
    /**Define el canvas*/
    public void setCanvas(Canvas canvas)
    {
        this.canvas = canvas;
    }
}