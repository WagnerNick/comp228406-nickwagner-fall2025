package ex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StudentApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Left Side - GridPane form
        GridPane form = new GridPane();
        form.setVgap(10);
        form.setHgap(10);

        TextField name = new TextField();
        TextField address = new TextField();
        TextField province = new TextField();
        TextField city = new TextField();
        TextField postal = new TextField();
        TextField phone = new TextField();
        TextField email = new TextField();

        form.add(new Label("Name:"), 0, 0);
        form.add(name, 1, 0);

        form.add(new Label("Address:"), 0, 1);
        form.add(address, 1, 1);

        form.add(new Label("Province:"), 0, 2);
        form.add(province, 1, 2);

        form.add(new Label("City:"), 0, 3);
        form.add(city, 1, 3);

        form.add(new Label("Postal:"), 0, 4);
        form.add(postal, 1, 4);

        form.add(new Label("Phone:"), 0, 5);
        form.add(phone, 1, 5);

        form.add(new Label("Email:"), 0, 6);
        form.add(email, 1, 6);

        // Right Side - major + courses
        VBox rightPane = new VBox(10);

        ToggleGroup majorGroup = new ToggleGroup();
        RadioButton cs = new RadioButton("Computer Science");
        RadioButton business = new RadioButton("Business");
        cs.setToggleGroup(majorGroup);
        business.setToggleGroup(majorGroup);

        ComboBox<String> courseBox = new ComboBox<>();
        ListView<String> addedCourses = new ListView<>();

        // Major change -> course list change
        majorGroup.selectedToggleProperty().addListener((obs, old, selected) -> {
            courseBox.getItems().clear();
            if (selected == cs) {
                courseBox.getItems().addAll("Python", "Java", "C#");
            } else if (selected == business) {
                courseBox.getItems().addAll("Accounting", "Marketing", "Finance");
            }
        });

        // Add course to list
        courseBox.setOnAction(e -> {
            String course = courseBox.getValue();
            if (course != null && !addedCourses.getItems().contains(course)) {
                addedCourses.getItems().add(course);
            }
        });

        rightPane.getChildren().addAll(cs, business, courseBox, addedCourses);

        // Checkboxes
        CheckBox council = new CheckBox("Student Council");
        CheckBox volunteer = new CheckBox("Volunteer Work");

        FlowPane activities = new FlowPane(10,10);
        activities.getChildren().addAll(council, volunteer);

        // Bottom - Display
        TextArea output = new TextArea();
        output.setPrefHeight(150);

        Button display = new Button("Display");

        display.setOnAction(e -> {
            StringBuilder builder = new StringBuilder();
            builder.append(name.getText()).append(", ")
                    .append(address.getText()).append(", ")
                    .append(city.getText()).append(", ")
                    .append(province.getText()).append(", ")
                    .append(postal.getText()).append(", ")
                    .append(phone.getText()).append(", ")
                    .append(email.getText()).append("\n");

            builder.append("Courses:\n");
            for (String c : addedCourses.getItems()) {
                builder.append(c).append("\n");
            }

            builder.append("Activities:\n");
            if (council.isSelected()) builder.append("Student Council:\n");
            if (volunteer.isSelected()) builder.append("Volunteer Work:\n");

            output.setText(builder.toString());
        });

        // Main Layout
        BorderPane root = new BorderPane();
        root.setLeft(form);
        root.setRight(rightPane);
        root.setBottom(new VBox(10, activities, display, output));

        Scene scene = new Scene (root, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Student Information App");
        primaryStage.show();
    }
}
