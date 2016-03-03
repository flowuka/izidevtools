/**
 *
 */
package com.app.izidevtools.util.apptools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

/**
 * Classe gérant toutes les méthodes utilitaires relatives au cryptage des
 * données.
 *
 * @author Flow
 */
public class CryptageUtils {

	private static final Logger logger = Logger.getLogger(CryptageUtils.class);

	/**
	 * Méthode gérant le cryptage des mots de passe.
	 *
	 * @param motDePasse
	 *            à crypter
	 * @return le mot de passe crypté
	 */
	public static String crypterMotDePasse(final String motDePasse) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (final NoSuchAlgorithmException e) {
			logger.error("Erreur dans le cryptage des mots de passe", e);
			return null;
		}
		md.update(motDePasse.getBytes());
		final byte byteData[] = md.digest();
		final StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

	public static void main(final String[] args) {
		System.out.println(crypterMotDePasse("123456"));
	}

}
