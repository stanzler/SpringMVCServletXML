package tv.politics.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.politics.dao.PoliticsUserDAO;
import tv.politics.model.PoliticsUserModel;

@Service
public class PoliticsUserServiceImpl implements PoliticsUserService {
	
		private PoliticsUserDAO politicsUserDAO;
		
		public void PoliticsUserDAO(PoliticsUserDAO p) {
			this.politicsUserDAO = p;
		}

		@Transactional
		public void save(PoliticsUserModel politicsUserModel) {
			
			politicsUserDAO.save(politicsUserModel);
			
		}
		
		@Transactional
		public void update(PoliticsUserModel politicsUserModel) {
			// TODO Auto-generated method stub
		
			politicsUserDAO.update(politicsUserModel);
		}
		
		@Transactional
		public void delete(PoliticsUserModel politicsUserModel) {
			// TODO Auto-generated method stub
			politicsUserDAO.delete(politicsUserModel);
			
		}
		
		@Transactional
		public List<PoliticsUserModel> readAll() {
			// TODO Auto-generated method stub
		
			return politicsUserDAO.readAll();
		}

}
