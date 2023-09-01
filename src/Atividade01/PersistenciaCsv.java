package Atividade01;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaCsv {

	public static void main(String[] args) {
		String nome = "joao";
		int idade = 30;

		String linhaCSV = nome + "," + idade;

		String nomeArquivo = nome + ".csv";

		try {
		    FileWriter writer = new FileWriter(nomeArquivo);
		    writer.write(linhaCSV);

		    writer.close();

		    System.out.println("Dados salvos com sucesso em " + nomeArquivo);
		 } catch (IOException e) {
		       e.printStackTrace();
		            System.out.println("Erro ao salvar os dados.");
		        }
		    }
	}

