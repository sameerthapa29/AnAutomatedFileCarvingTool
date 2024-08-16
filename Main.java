
package model;

import control.BrowseFileCtrl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		@SuppressWarnings("unused")
		BrowseFileCtrl scene = new BrowseFileCtrl(stage);
	}
}