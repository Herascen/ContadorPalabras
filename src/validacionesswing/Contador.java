
package validacionesswing;


public class Contador {

    int contador;
    int contador2;
      
      
    public String[] contadorPalabras(String frase) {
   
      String[] palabras = frase.split("\\W");
     String frase1=frase;
      
         int finalCadena = frase.length() - 1;
       boolean palabra = false;
        
        for (int x = 0; x < frase1.length(); x++) {
            if (Character.isLetter(frase1.charAt(x)) && x != finalCadena) {
                palabra = true;
            } else if (!Character.isLetter(frase1.charAt(x)) && palabra) {
                contador++;
            }else if(Character.isLetter(frase1.charAt(x)) && x == finalCadena){
                contador++;
            }
        }
      System.out.println(contador);
      
      return palabras;
    }

    public  char[] contadorLetras(String frase2) {
      char [] letras=new char[frase2.length()];
      
for(int i=0; i<=frase2.length()-1; i++){
    if(Character.isLetter(frase2.charAt(i))){
        
        contador2++;
        letras[i]=frase2.charAt(i);
    }
   
}

return letras;

    }
    
    public int getCantidadLetras(){
        return contador2;
    }
    public int getCantidadPalabras(){
        return contador;
    }

}
