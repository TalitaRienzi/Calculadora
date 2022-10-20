import java.util.Scanner;

public class calculo {
    
    public static void main(String[] args) {
        
        int number1;
        int number2;
        String operation = "";
        boolean exit = true;
        int control = 0;
       


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                 CALCULADORA ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        

        while (exit) {
            Scanner s = new Scanner(System.in);
            
            System.out.println("Digite a operação desejada ( +, -, *, / ): ");
            operation = s.nextLine();
            
           
            System.out.println("Digite o primeiro valor: ");
            number1 = Integer.parseInt(s.nextLine());

            System.out.println("Digite o segundo valor: ");
            number2 = Integer.parseInt(s.nextLine());

        
            if (operation.equals("+")) {
                System.out.println("O resultado da adição é: " + (number1 + number2));
                control++;
            }
            
            if (operation.equals("-")) {
                System.out.println("O resultado da subtração é: " + (number1 - number2));
                control++;
            }
            
            if (operation.equals("*")) {
                System.out.println("O resultado da multiplicação é: " + (number1 * number2));
                control++;
            }
            
            if (operation.equals("/")) {
                System.out.println("O resultado da divisão é: " + (number1 / number2));
                control++;

            }else{ 
                Scanner x = new Scanner(System.in);
                System.out.println("Deseja continuar (Sim/Não)? ");
                String n = x.nextLine();
                if(n.equalsIgnoreCase("Sim")) {
                    exit = true;
                }  else {
                    System.out.println("Volte Sempre! :)");
                    exit = false;
                    s.close();
                    x.close();

            
        }

      }
    }
  }
}



        