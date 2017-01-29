package gameeditor.commanddetails;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
/**
 * 
 * @author Pratiksha Sharma
 *
 */
public interface IDetailFrontEndUtil {
    public ComboBox<String> createComboBox(String [] boxOptions, String defaultValue);
    public BorderPane createBorderpane(Node right, Node left);
    public Button createButton(String property, EventHandler<MouseEvent> handler);
    //public TextArea createTypeName();
}
