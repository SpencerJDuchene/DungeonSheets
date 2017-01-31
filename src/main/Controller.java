package main;
/**
 * Sample Skeleton for 'Dungeon_Sheets_Gui.fxml' Controller Class
 */


import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import Player.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class Controller {
    //cant remember if making this global is bad or not
    StatGen statCreate = new StatGen();
    @FXML
    private TextField StrDisplay, DexDisplay,ConDisplay,ChaDisplay,WisDisplay,IntDisplay;
    @FXML
    private TextField StrDisplay1, DexDisplay1,ConDisplay1,ChaDisplay1,WisDisplay1,IntDisplay1;
    @FXML
    private TextField strModArea,dexModArea,conModArea,chaModArea,wisModArea,intModArea;
    @FXML
    private Label acroLabel, AnmlLabel,ArcanaLabel,athlLabel,DecepLabel,HistLabel,InsightLabel,IntimidLabel;
    @FXML
    private Label InvestLabel,MediLabel,NatureLabel,PercepLabel,PerformLabel,PersuadeLabel,ReliLabel;
    @FXML
    private Label SleightLabel,StealthLabel,SurviveLabel;
    @FXML
    private TextField strEdit,dexEdit,conEdit,chaEdit,wisEdit,intEdit;
    @FXML
    private javafx.scene.control.Button updateButton;



    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resourceBundle;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    void buttonPressed(ActionEvent buttonPressed){

    }
    @FXML // This method is called by the FXMLLoader when initialization is complete
    //omg this does wayyy to much imo how do I clean this up?
    void initialize() {
        int strength, dexterity,constitution,charisma,wisdom,intelligence;


        //use a method to let players pick stats
        //TODO change trueRandomStats to be 3 randoms 1-6 then add to get statistics right.
        statCreate.trueRandomStats();
        statCreate.statModGen();
        statCreate.skills();

        //loads the base stats
        strength = statCreate.getStrength();
        Integer strength1 = new Integer(strength);
        dexterity = statCreate.getDexterity();
        Integer dexterity1 = new Integer(dexterity);
        constitution = statCreate.getConstitution();
        Integer constitution1 = new Integer(constitution);
        charisma = statCreate.getCharisma();
        Integer charisma1 = new Integer(charisma);
        wisdom = statCreate.getWisdom();
        Integer wisdom1 = new Integer(wisdom);
        intelligence = statCreate.getIntelligence();
        Integer intelligence1 = new Integer(intelligence);
        //sets the base stats
        StrDisplay.setText(strength1.toString());
        DexDisplay.setText(dexterity1.toString());
        ConDisplay.setText(constitution1.toString());
        ChaDisplay.setText(charisma1.toString());
        WisDisplay.setText(wisdom1.toString());
        IntDisplay.setText(intelligence1.toString());
        //sets base stats on stat change page
        StrDisplay1.setText(strength1.toString());
        DexDisplay1.setText(dexterity1.toString());
        ConDisplay1.setText(constitution1.toString());
        ChaDisplay1.setText(charisma1.toString());
        WisDisplay1.setText(wisdom1.toString());
        IntDisplay1.setText(intelligence1.toString());


        //set the modifier text areas
        Integer StrMod = new Integer(statCreate.getStrength_Mod());
        strModArea.setText(StrMod.toString());
        Integer DexMod = new Integer(statCreate.getDexterity_Mod());
        dexModArea.setText(DexMod.toString());
        Integer ConMod = new Integer(statCreate.getConstitution_Mod());
        conModArea.setText(ConMod.toString());
        Integer ChaMod = new Integer(statCreate.getCharisma_Mod());
        chaModArea.setText(ChaMod.toString());
        Integer WisMod = new Integer(statCreate.getWisdom_Mod());
        wisModArea.setText(WisMod.toString());
        Integer IntMod = new Integer(statCreate.getIntelligence_Mod());
        intModArea.setText(IntMod.toString());

        //do this for all skills later
        acroLabel.setText(DexMod.toString());
        AnmlLabel.setText(ChaMod.toString());
        ArcanaLabel.setText(IntMod.toString());
        athlLabel.setText(StrMod.toString());
        DecepLabel.setText(ChaMod.toString());
        HistLabel.setText(IntMod.toString());
        InsightLabel.setText(WisMod.toString());
        IntimidLabel.setText(ChaMod.toString());
        InvestLabel.setText(IntMod.toString());
        MediLabel.setText(IntMod.toString());
        NatureLabel.setText(WisMod.toString());
        PercepLabel.setText(WisMod.toString());
        PerformLabel.setText(ChaMod.toString());
        PersuadeLabel.setText(ChaMod.toString());
        ReliLabel.setText(WisMod.toString());
        SleightLabel.setText(DexMod.toString());
        StealthLabel.setText(DexMod.toString());
        SurviveLabel.setText(WisMod.toString());
    }
}
