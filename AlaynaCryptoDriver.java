package cryptoManager;

public class AlaynaCryptoDriver {
	public static void main(String[] args){

		
		String plainText = "ALAYNA";
		
		
		
		
			String caesarString = CryptoManager.caesarEncryption(plainText, 200000);
			
			System.out.println("Encrypted with caesar cipher: " + caesarString);
			
			String caesarStringDecrypted = CryptoManager.caesarDecryption(caesarString, 200000);
			
			System.out.println("Decrypted with caesar cipher: " + caesarStringDecrypted);
			
			
			
			
			String key = "gamers it works!";
			
			String bellasoString = CryptoManager.bellasoEncryption(plainText, key);
			
			System.out.println("Encrypted with bellaso cipher: " + bellasoString);
			
			String bellasoStringDecrypted = CryptoManager.bellasoDecryption(bellasoString, key);
			
			System.out.println("Decrypted with bellaso cipher: " + bellasoStringDecrypted);
			
		
		
	}
}
