package view;

import controller.ProcessosController;

public class Principal {
	public static void main(String[] args) {
		
		ProcessosController procController = new ProcessosController();
		String os =  procController.os();
		
		System.out.println(os);
		
		String process = "TASKLIST /FO TABLE";
		procController.readProcess(process);
		
		String param = "notepad.exe";
		procController.killProcess(param);
	}
}
