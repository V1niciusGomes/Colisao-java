package massa.carro;
import java.util.Scanner;
public class MassaCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massaCorpo1, velocidadeCorpo1, massaCorpo2, velocidadeCorpo2;
        double velocidadeFinal;
        double energiaFinal, energiaInicial, energiaLiberada;
        double distanciaDeformacao;
        double aceleracaoMediaMs, aceleracaoMediaKm;
        double forcaG;
        System.out.println("============Velocidade e Massa============");
        System.out.print("Qual a massa do primeiro corpo (em kg): ");
        massaCorpo1 = sc.nextDouble();
        System.out.print("Qual a velocidade do primeiro corpo (em km/h): ");
        velocidadeCorpo1 = sc.nextDouble();
        System.out.print("Qual a massa do segundo corpo (em kg): ");
        massaCorpo2 = sc.nextDouble();
        System.out.print("Qual a velocidade do segundo corpo (em km/h): ");
        velocidadeCorpo2 = sc.nextDouble();
        System.out.println("==========================================");
        velocidadeCorpo1 = velocidadeCorpo1 * 1000 / 3600;
        velocidadeCorpo2 = velocidadeCorpo2 * 1000 / 3600;
        System.out.println("=============Velocidade Final=============");
        velocidadeFinal = (massaCorpo1 * velocidadeCorpo1 + massaCorpo2 * velocidadeCorpo2) / (massaCorpo1 + massaCorpo2);
        System.out.println("velocidade final = " + velocidadeFinal + " m/s");
        System.out.println("==========================================");
        System.out.println("=============Energia Cinetica=============");
        energiaInicial = 0.5 * massaCorpo1 * velocidadeCorpo1 * velocidadeCorpo1 + 0.5 * massaCorpo2 * velocidadeCorpo2 * velocidadeCorpo2;
        energiaFinal = 0.5 * (massaCorpo1 + massaCorpo2) * velocidadeFinal * velocidadeFinal;
        energiaLiberada = energiaInicial - energiaFinal;
        System.out.println("energia liberada = " + energiaLiberada + " J");
        System.out.println("==========================================");
        System.out.println("==========Deformacao e aceleracao=========");
        System.out.print("Qual a distancia de deformacao dos corpos durante a colisao em metros : ");
        distanciaDeformacao = sc.nextDouble();
        // Formula corrigida para aceleracao media usando a relacao v²=2ad
        double deltaVelocidade = Math.abs(velocidadeCorpo1 - velocidadeCorpo2);
        aceleracaoMediaMs = deltaVelocidade * deltaVelocidade / (2 * distanciaDeformacao);
        System.out.println("aceleracao media em m/s2 : " + aceleracaoMediaMs);
        aceleracaoMediaKm = aceleracaoMediaMs * 3.6;
        System.out.println("aceleracao media em Km/h2 : " + aceleracaoMediaKm);
        System.out.println("==========================================");
        System.out.println("============Forca da Gravidade============");
        forcaG = aceleracaoMediaMs / 9.81;
        System.out.println("forca G = " + forcaG + "G");
        System.out.println("==========================================");
        
    }
}