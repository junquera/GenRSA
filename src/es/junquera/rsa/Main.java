package es.junquera.rsa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("/**************************************/");
		System.out.println("/******** GENERAR CLAVES RSA **********/");
		System.out.println("/**************************************/\n");

		try {
			Scanner scin = new Scanner(System.in);
			System.out
					.print("Introduzca el tamaño de clave que desea (512 <= keysize <= 16384): ");
			String keysizeString = scin.nextLine();

			int keysize = Integer.parseInt(keysizeString);

			RSAKeyPair rsakp = new RSAKeyPair(keysize);
			
			System.out.println();
			
			System.out.println("PÚBLICA:\n" + rsakp.getPublicKey());
			System.out.println("PRIVADA:\n" + rsakp.getPrivateKey());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
