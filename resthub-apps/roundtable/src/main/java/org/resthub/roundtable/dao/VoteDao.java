package org.resthub.roundtable.dao;

import org.resthub.core.dao.GenericResourceDao;
import org.resthub.roundtable.model.Vote;

/**
 * Vote DAO.
 * @author Nicolas Carlier (mailto:pouicbox@yahoo.fr)
 */
public interface VoteDao extends GenericResourceDao<Vote> {

//	public boolean exist(String voter, Poll poll) {
//        final Query query = em.createNamedQuery("existVote");
//        query.setParameter("voter", voter);
//        query.setParameter("pid", poll.getId());
//
//        return ((Long) query.getSingleResult() >= 1);
//    }
	
}
