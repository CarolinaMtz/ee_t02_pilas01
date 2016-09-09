package ee_t02_pilas01;

public class Pila 
{
	char[] pila;
	Integer tope;
	Integer tam;

	public void push(char  dato)
	{
		if(tope < tam -1)
		{
			tope++;
			pila[tope] = dato;
		} else {
			    System.out.println("DESBORDAMIENTO");
		}
	}
	
	public char pop()
	{
		char resultado = 'E' ;
		if(tope > -1)
		{
			resultado = pila [tope];
			pila[tope] = pila[tope];
			tope--;
		} else {
			System.out.println("SUBDESBORDAMIENTO");
		}
		return resultado;
	}
	
	
	public char peek()
	{
		char resultado = 'E';
		if (tope > -1)
		{
			resultado = pila[tope];
		} else {
			System.out.println("SUBDESBORDAMIENTO");
		} return resultado;
	}
	
	public  Pila(Integer tamanio)
	{
		tope = -1;
		pila = new char [tamanio];
		tam = tamanio;
	}
	
}
