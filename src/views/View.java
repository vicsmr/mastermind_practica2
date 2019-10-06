package views;

import controllers.Controller;
import controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {
	
	public abstract void interact(Controller controller);
	
}
