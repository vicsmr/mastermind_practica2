package models;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private static final int MAX_LONG = 10;
	
	List<ProposedCombination> proposedCombinations;
	SecretCombination secretCombination;
	ArrayList<Result> results;

	public Game() {
		this.clear();
	}
	
	public void clear() {
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.secretCombination = new SecretCombination();
		this.results = new ArrayList<Result>();
	}
	
	public boolean isWinner() {
		if (this.results.get(this.getAttempts() - 1).isWinner()) {
			return true;
		}
		return false;
	}
	
	public boolean isLoser() {
		if (this.getAttempts() == MAX_LONG) {
			return true;
		}
		return false;
	}
	
	public int getAttempts() {
		return this.proposedCombinations.size();
	}
	
	public SecretCombination getSecretCombination() {
		return this.secretCombination;
	}
	
	public Error readProposedCombination(String characters, Error error) {
		ProposedCombination proposedCombination = new ProposedCombination();
		error = proposedCombination.read(characters, error);
		if (error == null) {
			proposedCombinations.add(proposedCombination);
		}
		return error;
	}
	
	public void calculateResultCombination() {
		this.results.add(this.secretCombination.getResult(this.proposedCombinations.get(this.getAttempts() - 1)));
	}
	
	public List<ProposedCombination> getProposedCombinationList() {
		return this.proposedCombinations;
	}
	
	public List<Result> getResultList() {
		return this.results;
	}
}
