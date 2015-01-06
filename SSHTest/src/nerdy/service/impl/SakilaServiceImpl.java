package nerdy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import nerdy.entity.dao.ActorTypeDAO;
import nerdy.service.SakilaService;

@Service("sakilaService")
public class SakilaServiceImpl implements SakilaService{

	@Autowired(required=true)
	@Qualifier("actorTypeDAO")
	private ActorTypeDAO actorTypeDAO;
	
	/**
	 * 以id查詢Actor資料
	 */
	@Override
	public List<String> selectActer(String id) {
//		// 開啟Session，相當於開啟JDBC的Connection
//        Session session = super.getSessionFactory().openSession(); 
//        Criteria criteria = session.createCriteria(Actor.class);
//        // 查詢user所有欄位
//        Iterator actors = criteria.list().iterator();
//        System.out.println("ActorId \t FirstName/LastName");
//        while(actors.hasNext()) {
//        	Actor actor = (Actor) actors.next(); 
//            System.out.println(actor.getActorId() +
//                                " \t " + actor.getFirstName() +
//                                "/" + actor.getLastName()); 
//        }
//
//        // 查詢user中符合條件的欄位
//        criteria.add(Restrictions.eq("name", "caterpillar"));
//        actors = criteria.list().iterator(); 
//        System.out.println("ActorId \t FirstName/LastName");
//        while(actors.hasNext()) {
//        	Actor actor = (Actor) actors.next(); 
//            System.out.println(actor.getActorId() +
//                    " \t " + actor.getFirstName() +
//                    "/" + actor.getLastName()); 
//        }
// 
//        session.close();
        
		return null;
	}
	
	@Override
	public int queryActor(){
		return actorTypeDAO.doQueryActorTypeList();
	}
	
}
