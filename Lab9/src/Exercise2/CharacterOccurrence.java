package Exercise2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CharacterOccurrence extends Application
{

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        VBox vBox  = new VBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();
        HBox hBox4 = new HBox();

        TextField inputStringTextField    = new TextField();
        TextField inputCharacterTextField = new TextField();
        TextField outputTextField         = new TextField();
        outputTextField.setEditable(false);
        Button btCalculate                = new Button("Calculate");

        hBox1.getChildren().addAll(new Label("Input String"), inputStringTextField);
        hBox2.getChildren().addAll(new Label("Input Character"), inputCharacterTextField);
        hBox3.getChildren().addAll(new Label("Output"), outputTextField);
        hBox4.getChildren().add(btCalculate);

        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        hBox3.setAlignment(Pos.CENTER);
        hBox4.setAlignment(Pos.CENTER);

        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox3.setSpacing(20);
        hBox4.setSpacing(20);

        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);

        btCalculate.setOnAction(event ->
        {
            int outputCount = characterCount(inputCharacterTextField.getText().charAt(0), inputStringTextField.getText());
            outputTextField.setText(Integer.toString(outputCount));
        });

        Scene scene = new Scene(vBox, 300, 300);
        primaryStage.setTitle("CharacterOccurrence");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public int characterCount(char inputCharacter, String inputString)
    {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++)
        {
            if (inputString.charAt(i) == inputCharacter)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}