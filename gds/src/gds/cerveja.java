package gds;

import java.util.Scanner;

public class cerveja {
	public static void main(String[]args){
		  Scanner le = new Scanner(System.in);
		  System.out.println("idade: ");
		  int idade = le.nextInt();
		  if(idade >= 18){
			  System.out.println("Quantas voc� vai comprar?");
			  int cerv = le.nextInt();
			  cerv = cerv * 4;
			  System.out.println(cerv);
		  }else{
			  System.out.println("N�o tem idade kkkk crian�a");
		  }
		  
}
}