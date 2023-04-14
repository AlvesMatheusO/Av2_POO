package av2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7_MatheusAlves {
    public static int somador (String path) {
        int soma = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linha;
            while ((linha = br.readLine()) != null) {
                soma += Integer.parseInt(linha.trim());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler");
        }
        return soma;
    }
    public static void main(String [] args) {
        String path = "C:\\Users\\mathe\\IdeaProjects\\Av2_POO\\src\\av2\\q7.txt";
        int soma = somador(path);
        System.out.println("A soma dos números no arquivo é: " + soma);
    }
}
