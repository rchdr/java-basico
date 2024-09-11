import java.util.InputMismatchException;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception{
        try{        
                Scanner terminal = new Scanner(System.in);
                System.out.println("Digite o primeiro parâmetro:");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro:");
		        int parametroDois = terminal.nextInt();
                terminal.close();
                    contar (parametroUm, parametroDois);
            }                 
                catch (ParametrosInvalidosException e) {
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
                }
                catch (InputMismatchException e) {
                    System.out.println("Os parâmetros devem ser somente inteiros!");
                }
        }
        static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
            if (parametro2 < parametro1) {
                throw new ParametrosInvalidosException();
            }
            else if (parametro1 == parametro2) {
                System.out.println("Para parâmetros iguais não há contagem.");
            }
            else{
                 int contagem = parametro2 - parametro1;
                 System.out.println("Contagem iniciada com os parâmetros " + parametro1 + " e "+ parametro2);
                 for (int i = 1; i <= contagem; i++) {
                    System.out.println("Imprimindo o número " + i);
                 }  
            }            
    }
}
