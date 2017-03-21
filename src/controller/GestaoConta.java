package controller;

import model.Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoConta {

	Scanner read = new Scanner(System.in);
	
	public void addConta(ArrayList<Conta> lista, int add){
		
		String nome, mail, tlm;
		
		System.out.printf("\nInsira o nome do cliente da conta " + (add+1) + ": ");
		nome = read.nextLine();
		
		System.out.printf("Insira o mail do cliente da conta " + (add+1) + ": ");
		mail = read.nextLine();
		
		System.out.printf("Insira o numero de telemovel do cliente da conta " + (add+1) + ": ");
		tlm = read.nextLine();
		
		lista.add(new Conta(add,nome,mail,tlm));
	}
	
	public void print(ArrayList<Conta> lista, int ac){
		
		if(ac == 0){
			for(Conta c : lista) {
		       System.out.println(c.toString());
		    }
		}
		else if(ac == 1){
			for(Conta c : lista){
				System.out.println(" " + (c.getId()+1) + " - " + c.getNome());
			}
		}
	}
	
	public void saldo(ArrayList<Conta> lista, boolean ver){
		
		float money;
		int id;
		
		print(lista,1);
		
		System.out.print("\nInsira o id do cliente para alterar o saldo: ");
		id = read.nextInt();
		
		System.out.print("\nInsira a quantidade que deseja alterar: ");
		money = read.nextFloat();
		
		if(ver == true){
			lista.get(id).setSaldo(lista.get(id).getSaldo()+money);
		}
		else{
			lista.get(id).setSaldo(lista.get(id).getSaldo()-money);
		}
	}
	
	public void delete(ArrayList<Conta> lista){
		
		int id;
		
		print(lista,1);
		
	}
	
}
