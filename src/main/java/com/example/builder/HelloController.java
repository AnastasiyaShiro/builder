package com.example.builder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class HelloController
{
    public VBox panel;
    

    @FXML
    protected void onHelloButtonClick()
    {
        Rectangle rect=new Rectangle();
        rect.setX(20);
        rect.setY(50);
        rect.setWidth(200);
        rect.setHeight(80);
        rect.setFill(Color.BISQUE);
        panel.getChildren().add(rect);
        Circle circl=new Circle();
        circl.setCenterX(50);
        circl.setRadius(90);
        circl.setFill(Color.AQUA);
        panel.getChildren().add(circl);
        Ellipse ell=new Ellipse();
        ell.setCenterX(30);
        ell.setCenterY(11);
        ell.setRadiusX(70);
        ell.setRadiusY(30);
        ell.setFill(Color.NAVY);
        panel.getChildren().add(ell);
    }
}