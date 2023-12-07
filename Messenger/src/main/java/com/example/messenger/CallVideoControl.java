package com.example.messenger;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CallVideoControl extends Controller{
    private String[] list = new String[]{"Trần Minh Thành", "Cá heo", "Cá mập", " Tôm sú", "Cún yêu", "Mèo yêu", "Bánh yêu",
    "Voi con", "Sóc chua", "Chíp bông" , "Đậu phộng", "Gia Hân"};
    @FXML
    private ListView<HBox> listCall;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
           creatList();
    }

    @Override
    protected void creatList(){
        for (String s : list) {
            Label messageLabel = new Label(s);
            HBox messageContainer = new HBox(20);

            ImageView imageView = new ImageView(getClass().getResource("/com/example/image/avatar.jpg").toExternalForm());
            imageView.setFitHeight(50);
            imageView.setFitWidth(55);
            messageContainer.getChildren().add(imageView);
            messageContainer.getChildren().add(messageLabel);
            messageContainer.setAlignment(Pos.CENTER_LEFT);
            listCall.getItems().add(messageContainer);
        }
    }
}
