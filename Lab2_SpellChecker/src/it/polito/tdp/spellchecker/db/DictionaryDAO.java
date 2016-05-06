package it.polito.tdp.spellchecker.db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;



public class DictionaryDAO {
	
	
	List <String> parole = new LinkedList <String>();
	List <String> words = new LinkedList <String>();

	public List<String> getDizionarioInglese(){
		
		try {
		FileReader fr = new FileReader( "rsc/English.txt");
		BufferedReader br = new BufferedReader(fr);
		String word;
		while ( (word= br.readLine())!=null){
			words.add(word);
		}
		br.close();
	} catch (IOException e){
		System.out.println("Erroe lettura file");
		}
		return words;
	}
	
	
	
	
	public List<String> getDizionario(){
		final String sql= "SELECT nome FROM parola";
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			String p = rs.getString("nome");
			parole.add(p);
		}
		return parole;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
		}
	}
	
	
	
}
