package controllers;

import models.Game;
import models.ProposedCombination;
import models.Result;
import models.SecretCombination;
import models.State;

import java.util.List;

import models.Error;

public abstract class Controller {
	
	protected Game game;
	protected State state;
	
	public Controller(Game game, State state) {
		this.game = game;
		this.state = state;
	}
	
	public void nextState() {
		this.state.next();
	}
	
	public SecretCombination getColorListSecretCombination() {
		return this.game.getSecretCombination();
	}
	
	public Error readProposedCombination(String characters, Error error) {
		return this.game.readProposedCombination(characters, error);
	}
	
	public void calculateResultCombination() {
		this.game.calculateResultCombination();
	}
	
	public int getAttempts() {
		return this.game.getAttempts();
	}
	
	public List<ProposedCombination> getProposedCombinationList() {
		return this.game.getProposedCombinationList();
	}
	
	public List<Result> getResultList() {
		return this.game.getResultList();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}
	
	public boolean isLoser() {
		return this.game.isLoser();
	}
	
	public abstract void accept(ControllerVisitor controllerVisitor);
}
