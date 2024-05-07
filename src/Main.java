import javax.swing.*;
import java.lang.management.LockInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        String enteredWord;
        String reverseWord;

        //Se guarda el valor ingresado
        enteredWord = JOptionPane.showInputDialog("Por favor ingrese la palabra que desee verificar");

        //bucle que itera de izq a derecha
      reverseWord= logic.palidromeInspectorO(enteredWord);

        logic.comparator(enteredWord,reverseWord);


    }
}