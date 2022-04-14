/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niebla.abraham.mastermind;
import java.awt.Color;
import java.awt.Graphics2D;

/**Una clase para llamar a todo lo visual de forma más rápida
 * @author (Ramírez Niebla Jesús Abraham) 
 * @version (1 04.14.2022)*/
public class MasterMindVisual
{
    //Atributos
    private Fichas fichas;
    private FichasCodigo fichasCodigo;
    private RetroAlimentacion retroAlim;
    private Canvas canvas;
    private Color cafeClaro = new Color(215, 204, 200);

    /**Constructor de objetos de la clase MasterMindVisual*/
    public MasterMindVisual()
    {
        fichas = new Fichas();
        fichasCodigo = new FichasCodigo();
        retroAlim = new RetroAlimentacion();
        canvas = new Canvas("MasterMind", 550, 750, cafeClaro);
        
        fichas.setCanvas(canvas);
        fichasCodigo.setCanvas(canvas);
        retroAlim.setCanvas(canvas);
    }
    
    /**Dibuja la parte visual inicial del MasterMind*/
    public void dibujarVista()
    {
        fichas.dibujarFichas(Color.gray);
        fichasCodigo.dibujarFichas(Color.darkGray);
        retroAlim.dibujarRetroAlim(cafeClaro);
    }

    public Fichas getFichas()
    {
        return fichas;
    }

    public void setFichas(Fichas fichas)
    {
        this.fichas = fichas;
    }

    public FichasCodigo getFichasCodigo()
    {
        return fichasCodigo;
    }

    public void setFichasCodigo(FichasCodigo fichasCodigo)
    {
        this.fichasCodigo = fichasCodigo;
    }

    public RetroAlimentacion getRetroAlimentacion()
    {
        return retroAlim;
    }

    public void setRetroAlimentacion(RetroAlimentacion retroAlim)
    {
        this.retroAlim = retroAlim;
    }

    public Canvas getCanvas()
    {
        return canvas;
    }

    public void setCanvas(Canvas canvas)
    {
        this.canvas = canvas;
    }
}