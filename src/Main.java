
import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoConta;
import model.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add=0,op=0;
		
		Scanner read = new Scanner(System.in);
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		do{
			
			System.out.println("\tMenu:\n"
					+ "  1- Inserir contas;\n"
					+ "  2- Listar contas;\n"
					+ "  3- Aumentar saldo;\n"
					+ "  4- Diminuir saldo;\n"
					+ "  5- Eliminar conta;\n"
					+ "  0- Sair;\n");
			
			System.out.printf("Insira a opção que deseja: ");
			
			try{
				op = read.nextInt();
			}
			catch(Exception e){
				op = 7;
				read.next();
			}
			
			System.out.println();
			
			switch(op){
			
			case 1: 
				System.out.printf("Insira a quantidade de contas que quer adicionar: ");
				op = read.nextInt();
			
				for(int i=0; i<op; i++){
					new GestaoConta().addConta(lista, add);
					add++;
				}
				
				break;
			case 2: new GestaoConta().print(lista,0); break;
			case 3: new GestaoConta().saldo(lista,true); break;
			case 4: new GestaoConta().saldo(lista,false); break;
			case 5: new GestaoConta().delete(lista, add); break;
			case 0: System.out.println("\nVai Sair!\n"); break;
			
			default: System.out.println("\nOpção Inválida!\n");
			
			}
			
			System.out.println();
			
		}while(op != 0);
		
		read.close();
	}
}
