package assignment2.userinterface;

import assignment2.parser.RichRailLexer;
import assignment2.parser.RichRailParser;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sun.tools.jar.CommandLine;
import assignment2.domain.Train;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by sjard on 8-1-2017.
 */

// Deze klas is de controller van de fxml file: fxml2
public class fxml2_Controller {
    @FXML
    TextArea CommandLine;

    public void Command(){
        {
            System.out.print("hij doet het");
//            String x = CommandText.getText();
            ANTLRInputStream input = new ANTLRInputStream(CommandLine.getText());
            RichRailLexer lex = new RichRailLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            RichRailParser parser = new RichRailParser(tokens);
            parser.command();
        }
    }
    public void ButtonIsClicked(ActionEvent actionEvent) {
        System.out.print("The button is clicked");
    }
}
