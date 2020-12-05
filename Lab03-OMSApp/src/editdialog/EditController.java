package editdialog;

import com.oms.bean.Book;
import com.oms.bean.Media;

import abstractdata.IDataManageController;
import api.MediaApi;

public class EditController implements IDataManageController<Media>{
	//private BookEditDialog dialog;
	//private IDataManageController<Media> controller;
	private MediaApi mediaApi;
	
	public EditController() {
		mediaApi = new MediaApi();
		//dialog = new BookEditDialog(media, controller);
	}

	@Override
	public void create(Media t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(Media t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Media t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Media t) {
		// TODO Auto-generated method stub
		if (t instanceof Book) {
			Book book = (Book) t;
			mediaApi.updateBook(book);
		}
	}
}
