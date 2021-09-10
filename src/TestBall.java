import java.lang.*;
import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        double xDisp = str.nextDouble();
        double yDisp = str.nextDouble();
        Ball b1 = new Ball(xDisp,yDisp);
        System.out.println(b1);
        b1.move(xDisp,yDisp);
    }
}