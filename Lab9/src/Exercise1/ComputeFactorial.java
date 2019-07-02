package Exercise1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComputeFactorial extends Application
{

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        VBox vBox  = new VBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();

        TextField inputTextField  = new TextField();
        TextField outputTextField = new TextField();
        outputTextField.setEditable(false);
        Button btCalculate        = new Button("Calculate");

        hBox1.getChildren().addAll(new Label("Input"), inputTextField);
        hBox2.getChildren().addAll(new Label("Output"), outputTextField);
        hBox3.getChildren().add(btCalculate);

        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        hBox3.setAlignment(Pos.CENTER);

        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox3.setSpacing(20);

        vBox.getChildren().addAll(hBox1, hBox2, hBox3);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);

        btCalculate.setOnAction(event ->
        {
            int outputValue = computeFactorial(Integer.parseInt(inputTextField.getText()));
            outputTextField.setText(Integer.toString(outputValue));
        });

        Scene scene = new Scene(vBox, 300, 300);
        primaryStage.setTitle("ComputeFactorial");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public int computeFactorial(int n)
    {
        if (n == 0) // Base case
            return 1;
        else
            return n * computeFactorial(n - 1); // Recursive call
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}