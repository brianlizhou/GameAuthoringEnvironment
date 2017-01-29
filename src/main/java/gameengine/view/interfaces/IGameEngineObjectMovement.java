package gameengine.view.interfaces;

import java.util.List;

import javafx.scene.Node;

public interface IGameEngineObjectMovement {
	
	/**
	 * Moves a specific objects/obstacle/character in a certain direction
	 * @param object
	 * @param xCoord
	 * @param yCoord
	 */
	public void moveObject(Node object,double xCoord, double yCoord);
	
	/**
	 *  Moves all objects on the screen in a certain direction
	 * @param frameObjects
	 * @param xCoord
	 * @param yCoord
	 */
	public void moveFrame(List<?> frameObjects, double xCoord, double yCoord);
}
