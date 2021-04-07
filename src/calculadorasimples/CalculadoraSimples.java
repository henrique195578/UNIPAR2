
package calculadorasimples;
import java.util.Scanner;

public class CalculadoraSimples {

  public static void main(String[] args) {
  double n1, n2;
  double Sum, Subtraction, Multiplication, Division, Square;
  int op; 
  Scanner entrada = new Scanner(System.in);
  
  System.out.println("informe o primeiro valor: ");
  n1 = entrada.nextDouble();
      System.out.println("Você quer a raiz quadrada desse numero?");
 
  
  System.out.println("informe o segunda valor: (Se o calculo desejado for Square informe 0) ");
  n2 = entrada.nextDouble();
  
 
  
System.out.println("###ESCOLHA SUA OPERAÇÃO### ");
System.out.println("[1] - SOMAR"); 
System.out.println("[2] - SUBTRAÇÃO ");
System.out.println("[3] - MULTIPLICAÇÃO ");
System.out.println("[4] - DIVISÃO");
System.out.println("[5] - RAIZ QUADRADA");
System.out.println("");
System.out.println(">>>>>>>digite aqui sua opção<<<<<<");
op = entrada.nextInt();

switch(op) {
    case 1:
    Sum = n1+n2;
        System.out.println("A soma é:"+ Sum);
    break;
    
    case 2:
    Subtraction = n1-n2;
        System.out.println("A subtração é:"+ Subtraction);
        break;
        
    case 3:
    Multiplication = n1*n2;
        System.out.println("A multiplicação é:"+ Multiplication);
        break;
        
    case 4:
    if(n1<n2){
        System.out.println("Impossivel de realizar o calculo");
        break;   
    }
    else{
        Division = n1/n2;
        System.out.println("A divisão é:"+ Division);
    }
    break;
    case 5:
  
    Square = Math.sqrt(n1);
        System.out.println("A raiz quadrada é:"+ Square);
    
    
}    
}
}
 
   
  
    
  
