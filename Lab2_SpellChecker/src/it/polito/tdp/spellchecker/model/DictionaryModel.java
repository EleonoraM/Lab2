package it.polito.tdp.spellchecker.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.spellchecker.db.RichWordDAO;

public class DictionaryModel {

	public List<RichWord>spellCheckText(List<String>inpututText){
		 List<RichWord> paroleErrate = new LinkedList<RichWord>();
		 RichWord r ;
		for( String s:inpututText){
		if (RichWordDAO.spellCheck(s)==false){
			r=new RichWord (s,false);
			paroleErrate.add(r);
			}
		}
		return paroleErrate;
	}
	
	public List<RichWord>spellCheckTextInglese(List<String>inpututText){
		 List<RichWord> paroleErrate = new LinkedList<RichWord>();
		 RichWord r ;
		for( String s:inpututText){
		if (RichWordDAO.spellCheckEnglish(s)==false){
			r=new RichWord (s,false);
			paroleErrate.add(r);
			}
		}
		return paroleErrate;
	}
	
	
	
	/*public static void main(String[] args) {
		DictionaryModel x = new DictionaryModel();
		List<String> parole = new LinkedList <String>();
		List<RichWord> paroleSbagliate = new LinkedList <RichWord>();

		 parole.add("amore");
		 parole.add("bello");
		 parole.add("sfsdfsfd");
		 paroleSbagliate=x.spellCheckText(parole);
		 for ( RichWord r:paroleSbagliate){
		 System.out.println(r.getParola());
	}}*/
}
