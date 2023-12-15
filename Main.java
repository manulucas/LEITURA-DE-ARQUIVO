package monitoria_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		List <Produto> pdt = new ArrayList<Produto>();
		System.out.println("Digite o caminho do arquivo: ");
		Scanner sc = new Scanner(System.in);
		String caminho = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			
			while(linha !=null)	{
				
				String [] st = linha.split(",");
				String nome = st[0];
				int preco = Integer.parseInt(st[1]);
				pdt.add(new Produto(nome, preco));
				linha = br.readLine();
				
			}for (Produto p: pdt) {
				System.out.println(p);
			}
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		

	}

}
