package main;

import javax.swing.JPanel;

import media.AdminBookPageController;

public class OMSAdminController {

	public OMSAdminController() {
	}
	
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
