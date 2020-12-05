package media;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.ADataSinglePane;
import abstractdata.IDataManageController;
import editdialog.BookEditDialog;
import editdialog.EditController;

@SuppressWarnings("serial")
public class AdminMediaListPane extends ADataListPane<Media>{
	BookEditDialog dialog;
	
	EditController editController;
	
	public AdminMediaListPane(ADataPageController<Media> controller) {
		this.controller = controller;
		editController = new EditController();
	}

	@Override
	public void decorateSinglePane(ADataSinglePane<Media> singlePane) {
		
		JButton button = new JButton("Edit");
		singlePane.addDataHandlingComponent(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog = new BookEditDialog(singlePane.getData(), editController);
			}
		});
	}
}
