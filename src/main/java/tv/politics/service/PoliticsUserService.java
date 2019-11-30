package tv.politics.service;
import java.util.List;

import tv.politics.model.PoliticsUserModel;

public interface PoliticsUserService {
	
	void save(PoliticsUserModel politicsUserModel);
	void update(PoliticsUserModel politicsUserModel);
	void delete (PoliticsUserModel politicsUserModel);
	List<PoliticsUserModel> readAll();
	
}
