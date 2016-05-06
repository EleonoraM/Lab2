package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.DictionaryModel;
import it.polito.tdp.spellchecker.model.RichWord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> bxCombo;

    @FXML
    private TextArea txtInput;

    @FXML
    private TextArea txtOutput;

    @FXML
    private Label avvisoUtente;

    @FXML
    private Label tempoUtente;

	private DictionaryModel model;

    @FXML
    void doClearText(ActionEvent event) {

    	bxCombo.getSelectionModel().clearSelection();
    	txtInput.clear();
    	txtOutput.clear();
    	avvisoUtente.setDisable(true);
    	tempoUtente.setDisable(true);
    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    	String frase=txtInput.getText();
    	List<String> ttParole= new LinkedList<String>();
    	List<RichWord> ttParoleSbagliate= new LinkedList<RichWord>();

    	String[]parole= frase.split(" ");
    	for ( String s :parole){
    		ttParole.add(s);
    	}
    	
    	if ( bxCombo.getValue()=="English"){
    		String risultato= "";
    		ttParoleSbagliate=model.spellCheckTextInglese(ttParole);
    		for(RichWord r: ttParoleSbagliate){
    			risultato += r.toString();
    		}
    		txtOutput.setText(risultato);
    	}
    	if ( bxCombo.getValue()=="Italiano"){
    		String risultato= "";
    		ttParoleSbagliate=model.spellCheckText(ttParole);
    		for(RichWord r: ttParoleSbagliate){
    			risultato += r.toString();
    		}
    		txtOutput.setText(risultato);
    	}
    }

    @FXML
    void initialize() {
    	bxCombo.getItems().addAll("English","Italiano");
        assert bxCombo != null : "fx:id=\"bxCombo\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert avvisoUtente != null : "fx:id=\"avvisoUtente\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert tempoUtente != null : "fx:id=\"tempoUtente\" was not injected: check your FXML file 'SpellChecker.fxml'.";

    }

	public void setModel(DictionaryModel model) {
this.model= model;		
	}
}
