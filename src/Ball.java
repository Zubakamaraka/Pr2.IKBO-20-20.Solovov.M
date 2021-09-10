import java.lang.*;

public class Ball
{
    private double x;
    private double y;
    public Ball(double x,double y)
    {
        x=0.0;
        y=0.0;
    }
    public Ball()
    {
        x=0.0;
        y=0.0;

    }
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public void setXY(double x,double y)
    {
        x=0;
        y=0;
    }
    public String toString()
    {
        return " Изначальные координаты точки x = "+this.x + " Изначальные координаты точки y = "+this.y;
    }
    public void move(double xDisp,double yDisp)
    {
        System.out.println(" Конечные координаты x = "+(x+xDisp)+" Конечные координаты y = "+(y+yDisp));
    }
}

