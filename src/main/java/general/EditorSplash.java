package general;

import frontend.util.ButtonTemplate;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Created by Delia on 12/2/2016.
 */
public class EditorSplash {
//    public static final int SPLASH_WIDTH = 700;
//    public static final int SPLASH_HEIGHT = 600;
    public static final int EDITOR_CORNER_X = 60;
    public static final int EDITOR_CORNER_Y = 115;
    private Pane splashWindow;
    private Rectangle backdrop;
    private NodeFactory myFactory;
    private MainController myMainController;

    public EditorSplash(MainController mainController, Pane startwindow){
        this.myFactory = new NodeFactory();
        this.myMainController = mainController;
        this.splashWindow = startwindow;
//<<<<<<< HEAD
        backdrop = myFactory.makeBackdrop(EDITOR_CORNER_X, EDITOR_CORNER_Y, 890, 170, Color.MIDNIGHTBLUE);
        splashWindow.getChildren().addAll(backdrop);

//    }
//=======
//        ImageView backgroundImageMainScreen = myFactory.makeBackgroundImage("FloatingCubes");
//        backgroundImageMainScreen.fitWidthProperty().bind(splashWindow.widthProperty());
//        backgroundImageMainScreen.fitHeightProperty().bind(splashWindow.heightProperty());
//        backdrop = myFactory.makeBackdrop(EDITOR_CORNER_X, EDITOR_CORNER_Y,
//                890, 170, Color.MIDNIGHTBLUE);
//        splashWindow.getChildren().addAll(backdrop);
        addTitle();
        addButtons();
//        addThumbnails();
//        addThumbnailLabels();
    }

//    public Parent setUpWindow() {
//        splashWindow = new Pane();
//        splashWindow.setPrefSize(SPLASH_WIDTH, SPLASH_HEIGHT);
//        ImageView backgroundImageMainScreen = myFactory.makeBackgroundImage("FloatingCubes");
//        backgroundImageMainScreen.fitWidthProperty().bind(splashWindow.widthProperty());
//        backgroundImageMainScreen.fitHeightProperty().bind(splashWindow.heightProperty());
//        backdrop = myFactory.makeBackdrop(65, 65, 590, 270, Color.MIDNIGHTBLUE);
//        splashWindow.getChildren().addAll(backgroundImageMainScreen, backdrop);
//        addTitle();
//        addButtons();
//        return splashWindow;
//    }
//>>>>>>> bbb5f8a7eeac0e7da002fb44b4496a0a7da27b8e

    private void addTitle() {
        Text title = myFactory.makeLabel("To start from scratch, select a game model", EDITOR_CORNER_X + 15,
                EDITOR_CORNER_Y + 40);
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        title.setOnMouseEntered(e -> backdrop.setOpacity(0.8));
        splashWindow.getChildren().add(title);
    }

    private void addButtons(){
        ButtonTemplate newTemplate = new ButtonTemplate("ForcedScroll",
                EDITOR_CORNER_X + 60, EDITOR_CORNER_Y + 70);
        Button forced = newTemplate.getButton();
        forced.setOnMouseEntered(e -> backdrop.setOpacity(0.8));
        forced.setOnMouseClicked(e -> myMainController.presentEditor(null));
        ImageView flappy = myFactory.makeThumbnailImage("Flappy", 150, 50);
        Tooltip TForced = myFactory.makeTooltip("Forced", flappy);
        Tooltip.install(forced, TForced);
        newTemplate = new ButtonTemplate("LimitedScroll",
                EDITOR_CORNER_X + 660, EDITOR_CORNER_Y + 70);
        Button limited = newTemplate.getButton();
        limited.setOnMouseEntered(e -> backdrop.setOpacity(0.8));
        ImageView doodle = myFactory.makeThumbnailImage("Doodle", 98, 130);
        Tooltip TLimited = myFactory.makeTooltip("Limited", doodle);
        Tooltip.install(limited, TLimited);
        newTemplate = new ButtonTemplate("FreeScroll",
                EDITOR_CORNER_X + 360, EDITOR_CORNER_Y + 70);
        Button free = newTemplate.getButton();
        free.setOnMouseEntered(e -> backdrop.setOpacity(0.8));
        free.setOnMouseClicked(e -> myMainController.presentEditor(null, "RPG"));
        ImageView mario = myFactory.makeThumbnailImage("Mario", 150, 50);
        Tooltip TFree = myFactory.makeTooltip("Free", mario);
        Tooltip.install(free, TFree);
        splashWindow.getChildren().addAll(forced, limited, free);
    }
}
