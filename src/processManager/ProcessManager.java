/*
 * Autor Jakub Rybakowski
 * Stworzony 13:15 18.10.2016
 */

package processManager;

public class ProcessManager {

	private Process mainProcess;
	
	public ProcessManager() {
		mainProcess = new Process("main", 0, 1); // główny proces 
	}

	public void newProcess(String name, int priority) { // tworzy nowy proces do poprawienia
		mainProcess.createChild(name, priority);
	}
	
	public void shutDown() { // zabija wszystkie procesy do testów do poprawienia
		mainProcess.kill();
	}
	
	public void ps() { // wyświetla wszystkie procesy w systemie
		System.out.println("PID\tPPID\tNAME\tSTATE\tPRIORITY");
		mainProcess.print();
	}
}
