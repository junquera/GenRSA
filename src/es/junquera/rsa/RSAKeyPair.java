package es.junquera.rsa;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAKey;
import java.util.Base64;

public class RSAKeyPair {

	private String publicKey;
	private String privateKey;

	public RSAKeyPair(int keysize) {
		KeyPairGenerator kpg = null;
		try {
			kpg = KeyPairGenerator.getInstance("RSA");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		kpg.initialize(keysize);
		KeyPair kp = kpg.generateKeyPair();

		this.publicKey = Base64.getEncoder()
				.encodeToString(kp.getPublic().getEncoded()).toString();

		this.privateKey = Base64.getEncoder()
				.encodeToString(kp.getPrivate().getEncoded()).toString();
	}

	public String getPublicKey() {
		return publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

}
