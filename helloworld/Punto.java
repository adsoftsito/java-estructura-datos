// Punto.java
public class Punto {

private int x; // coordenada x
private int y; // coordenada y

public Punto(int x_ , int y_ ) // constructor
{
 x = x_; 
 y = y_;
} 

public Punto() // constructor sin argumentos
{ 
  x = y = 0;
}

public int leerX() // devuelve el valor de x 
{ 
  return x;
}

public int leerY() // devuelve el valor de y 
{
 return y;
 
}

void fijarX(int valorX) 
{
 x = valorX;
}

void fijarY(int valorY) 
{ 
y = valorY;
}


public static void main(String[] argv)
{

Punto p;
p = new Punto();
p.fijarX (100);
System.out.println(" Coordenada x es " + p.leerX());
//System.out.println("hello point ...");

}

}
