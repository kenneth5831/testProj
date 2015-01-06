package nerdy.entity.dao.impl;

import nerdy.entity.Actor;
import nerdy.entity.dao.ActorTypeDAO;
import nerdy.entity.dao.impl.ActorTypeDAOImpl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("actorTypeDAO")
public class ActorTypeDAOImpl implements ActorTypeDAO {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
    public int doQueryActorTypeList() {
        Criteria criteria = sessionFactory.openSession().createCriteria(
        		Actor.class);
        
        return criteria.list().size();
    }
}
