/*
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

 - Incrementar el valor de la variable en uno cada vez que se ejecute.

 - Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor 
cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar 
un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

package ejctema4;


public class EjcTema4 {

    public static void main(String[] args) {
        int numeroIf = -5;
        int numeroWhile = 0;
        int estacion = 5;
        
        // primer item
        if(numeroIf > 0) {
            System.out.println(numeroIf + " es positivo.");
        } else if (numeroIf == 0){
            System.out.println(numeroIf + " es cero.");
        } else {
            System.out.println(numeroIf + " es negativo.");
        }
        
        System.out.println("-----------------------------------------");
        
        // segundo item
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        System.out.println("-----------------------------------------");
        
        // tercer item
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile < 3);
        
        System.out.println("-----------------------------------------");
        
        // cuarto item
        for(int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }
        
        System.out.println("-----------------------------------------");
        
        //quinto item
        switch(estacion){
            case 1: 
                System.out.println("Esta en la estacion de Otoño.");
                break;
            case 2:
                System.out.println("Esta en la estacion de Invierno.");
                break;
            case 3:
                System.out.println("Esta en la estacion de Primavera.");
                break;
            case 4:
                System.out.println("Esta en la estacion de Verano."); 
                break;
            default:
                System.out.println("No es una estacion.");
                break;
        }
        
    }
    
}
