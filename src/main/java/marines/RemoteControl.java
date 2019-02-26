package main.java.marines;

/**
 * Invoker
 * 
 * @author Marines Lopez Soliz
 */
public class RemoteControl {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}
