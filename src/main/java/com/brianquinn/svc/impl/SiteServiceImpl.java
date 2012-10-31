package com.brianquinn.svc.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brianquinn.model.Site;
import com.brianquinn.svc.SiteService;

@Service
@Transactional
public class SiteServiceImpl implements SiteService {

	@PersistenceContext
	EntityManager em;

	public List<Site> getAllSites() {
		CriteriaQuery<Site> c = em.getCriteriaBuilder().createQuery(Site.class);
		c.from(Site.class);
		return em.createQuery(c).getResultList();
	}

}
