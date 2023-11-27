import java.util.Scanner;

public class dowhile5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean viagemTerminou = false;
        double velocidadeAtual = 0;
        
        // Simulação da viagem - enquanto a viagem não terminou
        do {
            System.out.println("A viagem ainda não terminou. Digite a velocidade atual do carro (em km/h): ");
            double novaVelocidade = scanner.nextDouble();
            
            if (novaVelocidade > velocidadeAtual) {
                System.out.println("O carro está acelerando.");
            } else if (novaVelocidade < velocidadeAtual) {
                System.out.println("O carro está desacelerando.");
            } else {
                System.out.println("O carro está mantendo a mesma velocidade.");
            }
            
            velocidadeAtual = novaVelocidade;
            
            System.out.println("A viagem terminou? (Digite 'true' para terminar ou 'false' para continuar): ");
            viagemTerminou = scanner.nextBoolean();
            
        } while (!viagemTerminou);
        
        System.out.println("Viagem terminada. O programa foi encerrado.");
        scanner.close();
    }
}

