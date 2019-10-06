package views.console;

import santaTecla.utils.Console;

public enum Message {
	ATTEMPTS("#attempts attempt(s): "), 
	SECRET("*"), 
	RESUME("Do you want to continue"), 
	RESULT(" --> #blacks blacks and #whites whites"), 
	PROPOSED_COMBINATION("Propose a combination: "), 
	TITLE("----- MASTERMIND -----"), 
	WINNER("You've won!!! ;-)"), 
	LOSER("You've lost!!! :-("),
	NEW_LINE("\n");

	private String message;
	
	static private Console console; 
	static {
		Message.console = new Console();
	}

	private Message(String message) {
		this.message = message;
	}

	public void write() {
		Message.console.write(this.message);
	}

	public void writeln() {
		Message.console.writeln(this.message);
	}

	public void writeln(int attempts) {
		Message.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
	}

	public void writeln(int blacks, int whites) {
		Message.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}

}
