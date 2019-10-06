package controllers;

public interface ControllerVisitor {
	
	void visit(StartController startController);
	
	void visit (ProposedCombinationController proposeCombinationController);
	
	void visit(ResumeController resumeController);

}
