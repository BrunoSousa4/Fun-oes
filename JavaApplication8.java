
package javaapplication8;
import java.util.Scanner;
public class JavaApplication8 {
    {static int MaiorDe3 (int X,int Y,int Z)
    {if (X < Y)
        X=Y;
    if (X<Y)
        X=Z;
    return X ; }
    
    
    
    
            

    public static void main(String[] args)throws Exception  {
int X,Y,Z;
Scanner LerS = new Scanner (System.in);
System.out.print ("Digite o priemiro valor (X) ");
X = LerS.nextInt();
 System.out.print ("Digite o segundo numero (Y) ");
Y=LerS.nextInt();
System.out.print("Digite o terceiro numero (Z)");
Z=LerS.nextInt ();
System.out.println( "maior = " +MaiorDe3 (X,Y,Z)); 


        // TODO code application logic here
    }

}
