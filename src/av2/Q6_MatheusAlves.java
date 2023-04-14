package av2;
import java.util.Random;
public class Q6_MatheusAlves {

        public static int[][] printMatriz (int linha, int coluna){
            Random random = new Random();
            int[][] matriz = new int[linha][coluna];
            for(int i = 0; i< linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    matriz[i][j] = random.nextInt(10);
                }
            }
            return matriz;
        }
        public static void impMatriz(int[][] matriz) {
            int linha = matriz.length;
            int coluna = matriz[0].length;
            for (int i = 0; i < linha; i++) {
                for(int j = 0; j < coluna; j++) {
                    System.out.println(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static int[][] multMatriz(int[][] a, int[][] b){
            int linhaA = a.length;
            int colunaA = a[0].length;
            int colunaB = b[0].length;
            int[][] result = new int[linhaA][colunaB];
            for(int i = 0; i < linhaA; i++) {
                for(int j = 0; j < colunaB; j++) {
                    for(int k = 0; k < colunaA; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return result;

        }
        public static void main (String [] args) {
            int linha1 = 3;
            int coluna1 = 4;
            int linha2 = 4;
            int coluna2 = 2;

            int [][] matriz1 = printMatriz(linha1, coluna1);
            int [][] matriz2 = printMatriz(linha2, coluna2);
            int[][] resultado = multMatriz(matriz1, matriz2);

            System.out.println("Matriz 1");
            impMatriz(matriz1);

            System.out.println("Matriz 2");
            impMatriz(matriz2);

            System.out.println("Resultado");
            impMatriz(resultado);
        }
    }

