/**
 * @Carolina Martinez
 * 
 * Crear un repositorio que se llame ee_t02_pilas01 con lo siguiente:
 * "Agrupadores balanceados"
 * Un agrupador es considerado cualquierquiera de los siguientes carácteres: (,),{,},[, ó ].
 * Dos balanceadores son considerados pares si el agrupador 
 * que abre -- (, [, { -- está a la izquierda de un agrupador que cierra }, ], ) del mismo tipo.
 * Determinar si cada secuencia de ellos está balanceada.
 * Si una cadena de agrupadores está balanceada, imprimira:
 * TRUE en una nueva línea, de lo contrario, imprimir FALSE en una nueva línea.
 * 
*/

package ee_t02_pilas01;

import ee_t02_pilas01.Pila;
public class Agrupadores 
{
    public boolean evaluar(String agrup)//Metodo que evaluara cada cadena de agrupador (agrup) ingresado.
    {
          Pila p= new Pila(agrup.length()); // Se crea un nuevo objeto Pila llamado p
               
          for(int i=0; i<agrup.length(); i++) // Con este ciclo se recorrera la cadena
           {
               if(agrup.charAt(i)== '(') //Se comparara si el elemento en esa pocision es igual a la que se tiene.
               {
                   p.push(agrup.charAt(i)); //Si se cumple la condicion anterior, se agrega el elemento a la pila.
               } 
               else // De lo contrario, se sigue a la siguiente intruccion. Y asi sucesivamente.
               {
                     if(agrup.charAt(i)== '[')
                     {
                         p.push(agrup.charAt(i));
                     } 
                     else 
                     {
                            if(agrup.charAt(i)== '{')
                            {
                                 p.push(agrup.charAt(i));
                            } 
                            else 
                            {  
                                 if( p.peek() != 'E' )
                                 {//En la siguiente linea se compara si el elemento que se tiene, es par con el que esta en el tope.
                                     if( agrup.charAt(i) == ')' && p.peek() == '(' || agrup.charAt(i) == ']' && p.peek() == '[' || agrup.charAt(i) == '}' && p.peek() == '{' )
                                     {
                                         p.pop(); //Si se cumple la condicion anterior, el elemento que esta en el tope, es eliminado.
                                     }
                                     else
                                     {
                                         return false;
                                     }
                                 } 
                                 else 
                                 {
                                     return false;
                                 }
                            }  
                     }
               }
          }  
          
          return true;
    }
    
    public static void main(String[] args) //Metodo principal.
    {
        Agrupadores ab = new Agrupadores();// Se crea un nuevo objeto.
        System.out.println( ab.evaluar("{[()]}") );//Dentro del formato de impresion se manda a llamar el metodo evaluar.
        System.out.println( ab.evaluar("{[())]}") );
        System.out.println( ab.evaluar("{[([{}])}") );
        
    }
}
