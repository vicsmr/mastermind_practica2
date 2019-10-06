package views.console;

import java.util.List;

import controllers.Controller;
import models.Color;

public class SecretCombinationView {
	
	void writeln(Controller controller) {
		Message.SECRET.write();
		List<Color> colors = controller.getColorListSecretCombination().getCombination();
		for (int i = 0; i < colors.size(); i++) {
			Message.SECRET.write();
		}
		Message.NEW_LINE.write();
	}
}
