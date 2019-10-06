package views.console;

import controllers.Controller;
import controllers.ProposedCombinationController;
import controllers.ResumeController;
import controllers.StartController;
import santaTecla.utils.YesNoDialog;
import views.View;

public class ConsoleView extends View {
	
	SecretCombinationView secretCombinationView;
	ProposedCombinationView proposedCombinationView;
	ResultCombinationView resultCombinationView;
	
	public ConsoleView() {
		this.secretCombinationView = new SecretCombinationView();
		this.proposedCombinationView = new ProposedCombinationView();
		this.resultCombinationView = new ResultCombinationView();
	}
	
	@Override
	public void interact(Controller controller) {
		controller.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		startController.start();
		Message.NEW_LINE.write();
		Message.TITLE.writeln();
		this.secretCombinationView.writeln(startController);
	}
	
	@Override
	public void visit(ProposedCombinationController proposeCombinationController) {
		this.proposedCombinationView.writeln(proposeCombinationController);
		this.resultCombinationView.writeln(proposeCombinationController);
	}
	
	@Override
	public void visit(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read());
	}

}
