package br.com.brq.conversor.bean;

public class teste {

	public static void main(String[] args) {

		String binario = "11a";
		int decimal = 0;
		
		try {
		decimal = Integer.parseInt(binario, 2);
		}catch(Exception numberformatexException) {
			
		}
		System.out.println(decimal);
	}

}
