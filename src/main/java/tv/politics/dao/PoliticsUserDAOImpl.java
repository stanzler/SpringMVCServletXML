package tv.politics.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import tv.politics.model.PoliticsUserModel;

@Repository
public class PoliticsUserDAOImpl implements PoliticsUserDAO{
	
	private static final Log log = LogFactory.getLog(PoliticsUserModel.class);


	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
 
 
	public void save(PoliticsUserModel politicsUserModel) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(politicsUserModel);
		log.info("New Politics User saved successfully!");
		
	}

	public void update(PoliticsUserModel politicsUserModel) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(politicsUserModel);
		log.info("Existing User Update Successfully!");
		
	}

	public void delete(PoliticsUserModel politicsUserModel) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(politicsUserModel);
		log.info("New Politics User deleted successfully!");
		
	}

	@SuppressWarnings("unchecked")
	public List<PoliticsUserModel> readAll() {
		// TODO Auto-generated method stub
		
		String findAllUsers = "select * from Registrations";
		
		Session session = this.sessionFactory.getCurrentSession();
		List<PoliticsUserModel> politicsUserModelList = (List<PoliticsUserModel>) session.createQuery(findAllUsers);
		return politicsUserModelList;
		
	}

}
