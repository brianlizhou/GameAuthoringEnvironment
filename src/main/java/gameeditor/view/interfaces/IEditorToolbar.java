package gameeditor.view.interfaces;

import gameeditor.view.ViewResources;
import javafx.scene.layout.Pane;
/**
 * 
 * @author John Martin
 *
 */
public interface IEditorToolbar {
    public static final String IMAGE_FILE_TYPE = ViewResources.IMAGE_FILE_TYPE.getResource();
    public static final String MUSIC_FILE_TYPE = ViewResources.MUSIC_FILE_TYPE.getResource();
    public static final String IMAGE_FILE_LOCATION = ViewResources.IMAGE_FILE_LOCATION.getResource();
    public static final double SCENE_WIDTH = ViewResources.SCENE_WIDTH.getDoubleResource();
    public static final double SCENE_HEIGHT = ViewResources.SCENE_HEIGHT.getDoubleResource();

    public static final double TOOLBAR_WIDTH = ViewResources.TOOLBAR_WIDTH.getDoubleResource();
    public static final double TOOLBAR_HEIGHT = ViewResources.TOOLBAR_HEIGHT.getDoubleResource();

    public static final double BUTTON_IMAGE_HEIGHT = ViewResources.BUTTON_IMAGE_HEIGHT.getDoubleResource();
    public static final double BUTTON_IMAGE_YOFFSET = ViewResources.BUTTON_IMAGE_YOFFSET.getDoubleResource();

    public static final double BG_IMAGE_WIDTH_RATIO = ViewResources.BG_IMAGE_WIDTH_RATIO.getDoubleResource();
    public static final double BG_IMAGE_WIDTH = ViewResources.BG_IMAGE_WIDTH.getDoubleResource();
    public static final double BG_IMAGE_XOFFSET = ViewResources.BG_IMAGE_XOFFSET.getDoubleResource();

    public static final double AVATAR_IMAGE_WIDTH_RATIO = ViewResources.AVATAR_IMAGE_WIDTH_RATIO.getDoubleResource();
    public static final double AVATAR_IMAGE_WIDTH = ViewResources.AVATAR_IMAGE_WIDTH.getDoubleResource();
    public static final double AVATAR_IMAGE_XOFFSET = ViewResources.AVATAR_IMAGE_XOFFSET.getDoubleResource();

    public static final double MUSIC_IMAGE_WIDTH_RATIO = ViewResources.MUSIC_IMAGE_WIDTH_RATIO.getDoubleResource();
    public static final double MUSIC_IMAGE_WIDTH = ViewResources.MUSIC_IMAGE_WIDTH.getDoubleResource();
    public static final double MUSIC_IMAGE_XOFFSET = ViewResources.MUSIC_IMAGE_XOFFSET.getDoubleResource();

    public static final double LOAD_GAME_IMAGE_WIDTH = ViewResources.LOAD_GAME_IMAGE_WIDTH.getDoubleResource();
    public static final double LOAD_GAME_IMAGE_XOFFSET = ViewResources.LOAD_GAME_IMAGE_XOFFSET.getDoubleResource();
    public Pane getPane();




}
