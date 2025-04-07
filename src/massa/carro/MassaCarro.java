package massa.carro;
import java.util.Scanner;

public class MassaCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double massaCorpo1, velocidadeCorpo1, massaCorpo2, velocidadeCorpo2;
        double velocidadeFinal;
        double energiaInicial, energiaFinal, energiaLiberada;
        double distanciaDeformacao, tempoColisao;
        double aceleracaoMedia;
        double forcaG;
        
        System.out.println("=============== Velocidade e Massa ===============");
        System.out.print("Qual a massa do primeiro corpo (em kg): ");
        massaCorpo1 = sc.nextDouble();
        
        System.out.print("Qual a velocidade do primeiro corpo (em km/h): ");
        velocidadeCorpo1 = sc.nextDouble();
        
        System.out.print("Qual a massa do segundo corpo (em kg): ");
        massaCorpo2 = sc.nextDouble();
        
        System.out.print("Qual a velocidade do segundo corpo (em km/h): ");
        velocidadeCorpo2 = sc.nextDouble();
        System.out.println("=================================================");
        
        velocidadeCorpo1 = velocidadeCorpo1 * 1000 / 3600;
        velocidadeCorpo2 = velocidadeCorpo2 * 1000 / 3600;
        
        System.out.println("============== Velocidade Final ==============");
        velocidadeFinal = (massaCorpo1 * velocidadeCorpo1 + massaCorpo2 * velocidadeCorpo2) / (massaCorpo1 + massaCorpo2);
        System.out.printf("Velocidade final = %.2f m/s (%.2f km/h)%n", velocidadeFinal, velocidadeFinal * 3.6);
        System.out.println("=============================================");
        
        System.out.println("============== Energia Cinética ==============");
        energiaInicial = 0.5 * massaCorpo1 * velocidadeCorpo1 * velocidadeCorpo1 + 0.5 * massaCorpo2 * velocidadeCorpo2 * velocidadeCorpo2;
        energiaFinal = 0.5 * (massaCorpo1 + massaCorpo2) * velocidadeFinal * velocidadeFinal;
        energiaLiberada = energiaInicial - energiaFinal;
        System.out.printf("Energia inicial = %.2f J%n", energiaInicial);
        System.out.printf("Energia final = %.2f J%n", energiaFinal);
        System.out.printf("Energia liberada = %.2f J%n", energiaLiberada);
        System.out.println("=============================================");
        
        System.out.println("========== Deformação e Aceleração ==========");
        System.out.print("Qual a distância de deformação dos corpos durante a colisão (em metros): ");
        distanciaDeformacao = sc.nextDouble();
        
        System.out.print("Qual o tempo estimado da colisão (em segundos): ");
        tempoColisao = sc.nextDouble();
        
        double deltaVelocidade = Math.abs(velocidadeCorpo1 - velocidadeCorpo2);
        aceleracaoMedia = deltaVelocidade / tempoColisao;
        
        System.out.printf("Aceleração média = %.2f m/s²%n", aceleracaoMedia);
        System.out.printf("Aceleração média = %.2f km/h/s%n", aceleracaoMedia * 3.6);
        System.out.println("=============================================");
        
        System.out.println("============= Força da Gravidade ============");
        forcaG = aceleracaoMedia / 9.81;
        System.out.printf("Força G = %.2f G%n", forcaG);
        System.out.println("=============================================");
        
        System.out.println("======= Aceleração pela Energia/Força =======");
        double forcaMedia = energiaLiberada / distanciaDeformacao;
        double aceleracaoEnergia = forcaMedia / (massaCorpo1 + massaCorpo2);
        System.out.printf("Força média = %.2f N%n", forcaMedia);
        System.out.printf("Aceleração média = %.2f m/s²%n", aceleracaoEnergia);
        double forcaGEnergia = aceleracaoEnergia / 9.81;
        System.out.printf("Força G = %.2f G%n", forcaGEnergia);
        System.out.println("=============================================");
        
        sc.close();
    }
}