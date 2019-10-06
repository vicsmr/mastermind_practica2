package controllers;

import models.Game;
import models.State;

public class ProposedCombinationController extends Controller {
	
	public ProposedCombinationController(Game game, State state) {
		super(game, state);
	}
	
	@Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
