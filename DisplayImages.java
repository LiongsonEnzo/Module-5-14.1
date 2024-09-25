import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout
        GridPane gridPane = new GridPane();

        // Load images
        Image image1 = new Image("Everything-is-fine-meme-hilarious-zoom-background-min.png");
        Image image2 = new Image("IsThisAZoomUser.jpg");
        Image image3 = new Image("Rick-and-morty-background-for-funny-zoom-meetings-min.png");
        Image image4 = new Image("Stupid-and-funny-background-for-meetings-zoom-min.png");

        // Create ImageView objects for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Adjust the image sizes if needed
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(200);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);

        // Add images to the grid
        gridPane.add(imageView1, 0, 0); // (column 0, row 0)
        gridPane.add(imageView2, 1, 0); // (column 1, row 0)
        gridPane.add(imageView3, 0, 1); // (column 0, row 1)
        gridPane.add(imageView4, 1, 1); // (column 1, row 1)

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Display Images"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
