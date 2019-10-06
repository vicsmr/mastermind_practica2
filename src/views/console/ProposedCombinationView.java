package views.console;

import controllers.Controller;
import models.Error;
import santaTecla.utils.WithConsoleModel;

public class ProposedCombinationView extends WithConsoleModel {
	
	public void writeln(Controller controller) {
		Error error;
		do {
			error = null;
			Message.PROPOSED_COMBINATION.write();
			String characters = this.console.readString();
			error = controller.readProposedCombination(characters, error);
			if (error != null) {
				this.console.writeln(error.getMessage());
			}
		} while (error != null);
	}
}
