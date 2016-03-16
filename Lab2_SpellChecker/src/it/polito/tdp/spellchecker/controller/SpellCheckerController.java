	package it.polito.tdp.spellchecker.controller;

	import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextArea;

	public class SpellCheckerController {

			
	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ComboBox<?> tendinaBox;

	    @FXML
	    private TextArea testoImmesso;

	    @FXML
	    private Button btnSpell;

	    @FXML
	    private TextArea txtRestituito;

	    @FXML
	    private Label lblContieneErrori;

	    @FXML
	    private Button bntClear;

	    @FXML
	    private Label ritornaSecondi;

	    @FXML
	    void cambiaLingua(ActionEvent event) {

	    	
	    }

	    @FXML
	    void doClearText(ActionEvent event) {

	    }

	    @FXML
	    void doSpellCheck(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert tendinaBox != null : "fx:id=\"tendinaBox\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert testoImmesso != null : "fx:id=\"testoImmesso\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btnSpell != null : "fx:id=\"btnSpell\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert txtRestituito != null : "fx:id=\"txtRestituito\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert lblContieneErrori != null : "fx:id=\"lblContieneErrori\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert bntClear != null : "fx:id=\"bntClear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert ritornaSecondi != null : "fx:id=\"ritornaSecondi\" was not injected: check your FXML file 'SpellChecker.fxml'.";

	    }
	}


