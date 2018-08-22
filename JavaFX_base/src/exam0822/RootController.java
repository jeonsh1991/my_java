package exam0822;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private Button btnAdd;
	@FXML private TableView tableView;
	/*@FXML Button btnSave;
	@FXML Button btnCancel;
	@FXML TextField textName;
	@FXML TextField textKor;
	@FXML TextField textEng;
	@FXML TextField textMat;*/
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	private Stage primaryStage;
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	public void handleBtnAdd(ActionEvent e) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("추가");
		
		Parent parent = FXMLLoader.load(getClass().getResource("form.fxml"));
		Button btnOut = (Button) parent.lookup("#btnOut");
		btnOut.setOnAction(event->dialog.close());
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}

}
