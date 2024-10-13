package cryptoManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {


	String plainText = "ALAYNA";
	int caesarKey = 20;
	String bellasoKey = "GAMERS!";
	
	String caesarEncrypted = "U U-\"U";
	String bellasoEncrypted = "HMN^ T";

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds(plainText));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals(caesarEncrypted, CryptoManager.caesarEncryption(plainText, caesarKey));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals(plainText, CryptoManager.caesarDecryption(caesarEncrypted, caesarKey));
	}
	
	@Test
	public void testEncryptBellaso() {
		assertEquals(bellasoEncrypted, CryptoManager.bellasoEncryption(plainText, bellasoKey));
	}
	
	@Test
	public void testDecryptBellaso() {
		assertEquals(plainText, CryptoManager.bellasoDecryption(bellasoEncrypted, bellasoKey));
	}

}
