package it.polito.tdp.spellchecker.db;

public class RichWordDAO {
	static DictionaryDAO dao= new DictionaryDAO();

	//ricercaitaliano
	public static boolean spellCheck(String s) {
		
		if ( dao.getDizionario().contains(s))
			return true;
	
		
		return false;
	}
	//ricerainglese
	public static boolean spellCheckEnglish(String s) {
		
		if ( dao.getDizionarioInglese().contains(s))
			return true;
	
		
		return false;
	}

	
	
}
