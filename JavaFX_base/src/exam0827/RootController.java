package exam0827;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private Button btnAdd;
	@FXML private Button btnPageChart;
	@FXML private TableView<Student> tableView;
	
	private ObservableList<Student> list;
	
	private Stage primaryStage;
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList();
		
		TableColumn tc = tableView.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory("name"));
		tc.setStyle("-fx-alignment: CENTER;");
		
		tc = tableView.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory("korean"));
		tc.setStyle("-fx-alignment: CENTER;");
		
		tc = tableView.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory("math"));
		tc.setStyle("-fx-alignment: CENTER;");
		
		tc = tableView.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory("english"));
		tc.setStyle("-fx-alignment: CENTER;");
		
		tableView.setItems(list);
		
		
		
	}
	
	public void handleBtnAdd(ActionEvent event) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("추가");
		
		Parent parent = FXMLLoader.load(getClass().getResource("form.fxml"));
		Button btnFormAdd = (Button) parent.lookup("#btnFormAdd");
		btnFormAdd.setOnAction(e-> {
			TextField txtName = (TextField)parent.lookup("#txtName");
			TextField txtKorean = (TextField)parent.lookup("#txtKorean");
			TextField txtMath = (TextField)parent.lookup("#txtMath");
			TextField txtEnglish = (TextField)parent.lookup("#txtEnglish");
			list.add(new Student(
					txtName.getText(),
					Integer.parseInt(txtKorean.getText()),
					Integer.parseInt(txtMath.getText()),
					Integer.parseInt(txtEnglish.getText())
					));
		
	});
		Button btnFormCancel = (Button) parent.lookup("#btnFormCancel");
		btnFormCancel.setOnAction(e->dialog.close());
		
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();

	}
	
	public void handleBtnPageChart(ActionEvent event) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("성적");
		
		Parent parent = FXMLLoader.load(getClass().getResource("barchart.fxml"));
		
		BarChart barChart = (BarChart) parent.lookup("#barChart");
		
		XYChart.Series seriesKorean = new XYChart.Series();
		seriesKorean.setName("국어");
		ObservableList koreanList = FXCollections.observableArrayList();
		for(int i =0; i<list.size(); i++) {
			koreanList.add(new XYChart.Data(list.get(i).getName(), list.get(i).getKorean()));
		}
		seriesKorean.setData(koreanList);
		barChart.getData().add(seriesKorean);
		
		XYChart.Series seriesMath = new XYChart.Series();
		seriesMath.setName("수학");
		ObservableList mathList = FXCollections.observableArrayList();
		for(int i =0; i<list.size(); i++) {
			mathList.add(new XYChart.Data(list.get(i).getName(), list.get(i).getMath()));
		}
		seriesMath.setData(mathList);
		barChart.getData().add(seriesMath);
		
		XYChart.Series seriesEnglish = new XYChart.Series();
		seriesEnglish.setName("영어");
		ObservableList englishList =FXCollections.observableArrayList();
		for(int i=0; i<list.size(); i++) {
			englishList.add(new XYChart.Data(list.get(i).getName(), list.get(i).getEnglish()));
		}
		seriesEnglish.setData(englishList);
		barChart.getData().add(seriesEnglish);
		
		
		Button chartCancel = (Button) parent.lookup("#chartCancel");
		chartCancel.setOnAction(e->dialog.close());
		
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
}
