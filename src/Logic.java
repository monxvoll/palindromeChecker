import javax.swing.*;
import java.util.Objects;

public class Logic {

    public String palidromeInspectorO(String enteredWord){
        StringBuilder sb = new StringBuilder();
        for (int j = enteredWord.length() - 1; j >= 0; j--) {
            char aux = enteredWord.charAt(j);
           sb.append(aux);

        }
        return sb.toString();
    }
    public void comparator(String enteredWord , String inverseWord){
        if(Objects.equals(enteredWord, inverseWord)){
            System.err.println("La palabra " + "["+enteredWord+"]" +" es un palindromo ");
        }else {
            System.err.println("La palabra " + "["+enteredWord+"]" +" no un palindromo ya que al leerla al revez , se lee como :  "+"["+inverseWord+"]");
        }
    }
}
