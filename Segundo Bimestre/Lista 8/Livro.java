import java.io.*;
import java.util.*;

public class Livro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo de leitura (.txt): ");
        String arquivoLeitura = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(arquivoLeitura);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("resultado.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            int palavrasMaisDe3Letras = 0;
            int palavrasIniciamComVogal = 0;
            Map<String, Integer> palavrasRepetidas = new HashMap<>();
            Map<String, Integer> palavrasUnicas = new HashMap<>();
            int quantidadeTotalPalavras = 0;
            int quantidadeRepeticoesAComCrase = 0;
            int quantidadePalavrasTerminamEmAO = 0;

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String[] palavras = linha.split("[\\s.,;?!]+");

                for (String palavra : palavras) {
                    palavra = palavra.replaceAll("[^a-zA-ZÀ-ú]", "");

                    if (!palavra.isEmpty()) {
                        quantidadeTotalPalavras++;

                        if (palavra.length() > 3) {
                            palavrasMaisDe3Letras++;

                            char primeiraLetra = Character.toLowerCase(palavra.charAt(0));
                            if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i'
                                    || primeiraLetra == 'o' || primeiraLetra == 'u') {
                                palavrasIniciamComVogal++;
                            }

                            int contador = palavrasRepetidas.getOrDefault(palavra, 0);
                            palavrasRepetidas.put(palavra, contador + 1);

                            if (!palavrasUnicas.containsKey(palavra)) {
                                palavrasUnicas.put(palavra, 1);
                            } else {
                                palavrasUnicas.put(palavra, palavrasUnicas.get(palavra) + 1);
                            }
                        }

                        quantidadeRepeticoesAComCrase += contarRepeticoesCaractere(palavra, 'à');

                        if (palavra.toLowerCase().endsWith("ão")) {
                            quantidadePalavrasTerminamEmAO++;
                        }
                    }
                }
            }

            bufferedReader.close();
            bufferedWriter.write("Quantidade de palavras com mais de 3 letras: " + palavrasMaisDe3Letras);
            bufferedWriter.newLine();
            bufferedWriter.write("Quantidade de palavras que iniciam com vogal: " + palavrasIniciamComVogal);
            bufferedWriter.newLine();

            List<Map.Entry<String, Integer>> palavrasRepetidasOrdenadas = ordenarPorValor(palavrasRepetidas);
            bufferedWriter.write("Cinco palavras com mais de 3 letras com a maior quantidade de repetições:");
            bufferedWriter.newLine();
            escreverPalavras(bufferedWriter, palavrasRepetidasOrdenadas, 5);

            List<Map.Entry<String, Integer>> palavrasUnicasOrdenadas = ordenarPorValor(palavrasUnicas);
            bufferedWriter.write("Cinco palavras com mais de 3 letras utilizadas apenas uma vez:");
            bufferedWriter.newLine();
            escreverPalavras(bufferedWriter, palavrasUnicasOrdenadas, 5);

            bufferedWriter.write("Quantidade total de palavras: " + quantidadeTotalPalavras);
            bufferedWriter.newLine();
            bufferedWriter.write("Quantidade de repetições da vogal 'à' com crase: " + quantidadeRepeticoesAComCrase);
            bufferedWriter.newLine();
            bufferedWriter.write("Quantidade de repetições de palavras que terminam com 'ão': " + quantidadePalavrasTerminamEmAO);

            System.out.println("Análise concluída. Resultados gravados em resultado.txt.");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static int contarRepeticoesCaractere(String palavra, char caractere) {
        int contador = 0;
        for (char c : palavra.toCharArray()) {
            if (c == caractere) {
                contador++;
            }
        }
        return contador;
    }

    private static List<Map.Entry<String, Integer>> ordenarPorValor(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return list;
    }

    private static void escreverPalavras(BufferedWriter writer, List<Map.Entry<String, Integer>> palavras, int quantidade) throws IOException {
        int contador = 0;
        for (Map.Entry<String, Integer> entry : palavras) {
            if (contador >= quantidade) {
                break;
            }
            writer.write(entry.getKey() + ": " + entry.getValue());
            writer.newLine();
            contador++;
        }
    }
}