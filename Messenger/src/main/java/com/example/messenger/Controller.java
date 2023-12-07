package com.example.messenger;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    protected AnchorPane paneSwitch;

    @FXML
    protected ImageView chat;

    @FXML
    protected ImageView callvideo;

    @FXML
    protected ImageView phonebook;

    @FXML
    protected ImageView tin;

    @FXML
    private ListView<HBox> listMess;

    private String[] list = new String[]{"Hoàng Đăng Khải", "Bùi Đức Anh", "Nguyễn Hoàng Anh", "Lê Thị Hải Anh", "Trần Đức Đăng Khôi","Bùi Ngọc Khánh",
    "Nguyễn Trần Hoàng Minh","Harry Potter","Hermione Granger","Mẹ yêu" , "Bố yêu", "Chị yêu", "Em yêu","Anh yêu","Vợ yêu", "Cá heo yêu",};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
          creatList();
           chat.setOnMouseClicked(new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent mouseEvent) {
                   switchComponent("./src/main/resources/com/example/messenger/MainUI.fxml");
               }
           });
           callvideo.setOnMouseClicked(new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent mouseEvent) {
                  switchComponent("./src/main/resources/com/example/messenger/CallVideoGui.fxml");
               }
           });
           tin.setOnMouseClicked(new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent mouseEvent) {
                 switchComponent("./src/main/resources/com/example/messenger/TinGui.fxml");
               }
           });
           phonebook.setOnMouseClicked(new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent mouseEvent) {
                   switchComponent("./src/main/resources/com/example/messenger/PhoneBookGui.fxml");
               }
           });


    }
    private void setNode(Node node) {
        paneSwitch.getChildren().clear();
        paneSwitch.getChildren().add(node);
    }

    @FXML
    protected void switchComponent(String path) {
        try {
            URL url = new File(path).toURI().toURL();
            AnchorPane cmp = FXMLLoader.load(url);
            setNode(cmp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void creatList () {
        for (String s : list) {
            Label messageLabel = new Label(s);
            HBox messageContainer = new HBox(20);

            ImageView imageView = new ImageView(getClass().getResource("/com/example/image/avatar.jpg").toExternalForm());
            imageView.setFitHeight(50);
            imageView.setFitWidth(55);
            messageContainer.getChildren().add(imageView);
            messageContainer.getChildren().add(messageLabel);
            messageContainer.setAlignment(Pos.CENTER_LEFT);
            listMess.getItems().add(messageContainer);
        }
    }

}