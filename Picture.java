/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Square campo;
    private Person juanito;
    private Circle circulo1;
    private Circle circulo2;
    private Circle circulo3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        campo = new Square();
        campo.changeColor("green");
        campo.moveHorizontal(-350);
        campo.moveVertical(130);
        campo.changeSize(1500);
        campo.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        juanito = new Person();
        juanito.moveHorizontal(-230);
        juanito.moveVertical(20);
        
        circulo1 = new Circle();
        circulo1.changeColor("red");
        circulo1.moveHorizontal(200);
        circulo1.moveVertical(50);
        circulo1.changeSize(30);
        
        circulo2 = new Circle();
        circulo2.changeColor("black");
        circulo2.moveHorizontal(150);
        circulo2.moveVertical(100);
        circulo2.changeSize(30);
        
        circulo3 = new Circle();
        circulo3.changeColor("green");
        circulo3.moveHorizontal(150);
        circulo3.moveVertical(50);
        circulo3.changeSize(30);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            circulo1.changeColor("black");
            circulo2.changeColor("black");
            circulo3.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            campo.changeColor("green");
            circulo1.changeColor("red");
            circulo2.changeColor("black");
            circulo3.changeColor("green");
        }
    }
    /**
     * Change this picture to use color display
     */
    public void puestaDeSol()
    {
        if (sun != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(120);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            circulo1.changeColor("black");
            circulo2.changeColor("black");
            circulo3.changeColor("black");
        }
    }
    /**
     * Change this picture to use color display
     */
    public void paseo()
    {
        if (juanito != null)   // only if it's painted already...
        {
            juanito.makeVisible();
            juanito.slowMoveHorizontal(100);   
        }
    }
    /**
     * Change this picture to use color display
     */
    public void figuras()
    {
        if (circulo1 != null)
        if (circulo2 != null)
        if (circulo3 != null)// only if it's painted already...
        {
            circulo2.makeVisible();
            circulo2.slowMoveVertical(-50);
            circulo3.makeVisible();
            circulo3.slowMoveHorizontal(50);
            circulo1.makeVisible();
            circulo1.slowMoveVertical(50);
        }
    }
    /**
     * Change this picture to use color display
     */
    public void colorFiguras()
    {
        if (circulo1 != null)
        if (circulo2 != null)
        if (circulo3 != null)// only if it's painted already...
        {
            circulo1.changeColor("black");
            circulo2.changeColor("green");
            circulo3.changeColor("red");
        }
    }
}

     