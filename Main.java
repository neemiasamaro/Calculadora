package Calculadora;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int number1, number2;
        String ope;
        String choice;
        boolean option = true;
        Scanner input = new Scanner(System.in);
        while (option) {
            System.out.print("First Number >>>> ");
            number1 = input.nextInt();
            System.out.print("Second Number >>>> ");
            number2 = input.nextInt();
            System.out.print("'+' - Sum\n'-' - Subtraction\n'*' - Multiplication\n'/' - Split\nOperation >>>> ");
            ope = input.next();
            operations(number1, number2, ope);
            System.out.print(" S - Sim\n N - Não\nDeseja realizar outra operação? >>>>");
            choice = input.next();

            if(choice.toUpperCase().equals("S")){
                option = true;
            } else if (choice.toUpperCase().equals("N")){
                option = false;
            } else{
                System.out.println("Fechando por entrada inesperada!");
                option = false;
            }
        }
        input.close();
    }

    static int operations(int number1, int number2, String ope) {
        switch (ope) {
            case "+":
                System.out.println("Resultado = " + number1 + number2);
                break;

            case "-":
                System.out.println("Resultado = " + (number1 - number2));
                break;

            case "*":
                System.out.println("Resultado = " + number1 * number2);
                break;

            case "/":
                System.out.println("Resultado = " + number1 / number2 + " e resto " + (number1 % number2));
                break;
        }
        return 0;
    }
}
    