package com.example.myFramework.DAO;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class myFrameworkDao {
    @PersistenceContext
    private EntityManager em;

    private static final Logger log = LoggerFactory.getLogger(myFrameworkDao.class);
    
}
