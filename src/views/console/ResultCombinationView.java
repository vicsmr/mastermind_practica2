package views.console;

import java.util.List;

import controllers.Controller;
import models.Color;
import models.ProposedCombination;
import models.Result;
import santaTecla.utils.WithConsoleModel;

public class ResultCombinationView extends WithConsoleModel {
	
	public void writeln(Controller controller) {
		controller.calculateResultCombination();
		Message.NEW_LINE.write();
		Message.ATTEMPTS.writeln(controller.getAttempts());
		new SecretCombinationView().writeln(controller);
		List<ProposedCombination> proposedCombinations = controller.getProposedCombinationList();
		List<Result> results = controller.getResultList();
		for (int i = 0; i < controller.getAttempts(); i++) {
			for (Color color:proposedCombinations.get(i).getColors()) {
				this.console.write(color.getInitial());
			}
			Message.RESULT.writeln(results.get(i).getBlacks(), results.get(i).getWhites());
		}
		if (controller.isWinner()) {
			Message.WINNER.writeln();
			controller.nextState();
		}
		if (controller.isLoser()) {
			Message.LOSER.writeln();
			controller.nextState();
		}
	}
}
