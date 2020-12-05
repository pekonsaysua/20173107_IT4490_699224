package media;

import java.util.List;
import java.util.Map;

import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.ADataSearchPane;
import abstractdata.ADataSinglePane;

public class AdminMediaPageController extends ADataPageController<Media> {
	public AdminMediaPageController() {
		super();
	}
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	@Override
	public ADataSearchPane createSearchPane() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADataSinglePane<Media> createSinglePane() {
		// TODO Auto-generated method stub
		return null;
	}
}

