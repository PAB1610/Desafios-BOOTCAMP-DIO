
    // Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.math.BigDecimal;
import java.util.Scanner;

    public class MainSomaH {

        public static void main(String[] Args) {

            double h = 0;
            Scanner sc = new Scanner(System.in);
            double n = sc.nextDouble();



            for (int i = 1; i <= n; i++) {
                //TODO: Calcule o valor de H de forma que resulte na soma dos termos:

                //não entendi mas com o comando (double), o sistema fez uma soma pegando apenas 2 casas decimais
                System.out.println(h += (double)1/i);

            }
            //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:


            System.out.println(String.format("%.0f", h)); //esse comando faz arredondamento

        }
    }