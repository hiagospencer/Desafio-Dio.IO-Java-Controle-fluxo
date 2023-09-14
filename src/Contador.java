import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
        		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro tem que ser maior que o primeiro");
		}
        
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            int numeroAtual = 0;
            System.out.println("");
            System.out.println("================ IMPRIMINDO O RESULTADO ================");
            System.out.println("");
            for(int i = 0; i < contagem; i++){
                numeroAtual++;
                System.out.println("Imprimindo o número " + numeroAtual);
            }
        }

	}
}
