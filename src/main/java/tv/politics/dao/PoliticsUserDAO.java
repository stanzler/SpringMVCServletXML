package tv.politics.dao;

import java.util.List;

import tv.politics.model.PoliticsUserModel;

public interface PoliticsUserDAO {
	
	void save(PoliticsUserModel politicsUserModel);
	void update(PoliticsUserModel politicsUserModel);
	void delete (PoliticsUserModel politicsUserModel);
	List<PoliticsUserModel> readAll();
	
}
