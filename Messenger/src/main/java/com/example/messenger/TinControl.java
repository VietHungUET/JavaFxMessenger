package com.example.messenger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class TinControl extends Controller {
    @FXML
    private Label labelStory4;


    @FXML
    private  Label labelStroy;

    @FXML
    private  Label labelStory2;

    @FXML
    private  Label labelStory3;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        ImageView imageView1 = new ImageView(getClass().getResource("/com/example/image/anh1.jpg").toExternalForm());
        imageView1.setFitHeight(234);
        imageView1.setFitWidth(182);

        ImageView imageView2 = new ImageView(getClass().getResource("/com/example/image/anh.jpg").toExternalForm());
        imageView2.setFitHeight(234);
        imageView2.setFitWidth(182);

        ImageView imageView3 = new ImageView(getClass().getResource("/com/example/image/anh.jpg").toExternalForm());
        imageView3.setFitHeight(234);
        imageView3.setFitWidth(184);

        ImageView imageView4 = new ImageView(getClass().getResource("/com/example/image/anh.jpg").toExternalForm());
        imageView4.setFitHeight(234);
        imageView4.setFitWidth(182);

        labelStroy.setGraphic(imageView1);
        labelStory2.setGraphic(imageView2);
        labelStory3.setGraphic(imageView3);
        labelStory4.setGraphic(imageView4);
    }



}
