package controllers;

import models.Game;
import models.State;

public class StartController extends Controller {
	
	public StartController(Game game, State state) {
		super(game, state);
	}
	
	public void start() {
		this.state.next();
	}
	
	@Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
