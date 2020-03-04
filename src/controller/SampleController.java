package controller;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class SampleController {
	@FXML
	Group group;
	
	@FXML
	Circle head;
	@FXML
	CubicCurve back;
	@FXML
	Ellipse body;
	
	@FXML
	Path path;
	@FXML
	MoveTo moveTo;
	@FXML
	CubicCurveTo cubicCurveTo;
	
	public void setAnimation() {
		PathTransition transition = new PathTransition();
		transition.setDuration(Duration.millis(5000));
		transition.setPath(path);
		transition.setNode(group);
		
		//transition.setCycleCount(Timeline.INDEFINITE);
		//transition.setAutoReverse(true);
		
		System.out.println("start of animation");
		
		transition.play();
		transition.setOnFinished(a-> {transition.play();});
	}
}