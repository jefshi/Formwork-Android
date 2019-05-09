package com.csp.formwork.database.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.csp.formwork.database.tblbean.TblTask;

import com.csp.formwork.database.dao.TblTaskDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig tblTaskDaoConfig;

    private final TblTaskDao tblTaskDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        tblTaskDaoConfig = daoConfigMap.get(TblTaskDao.class).clone();
        tblTaskDaoConfig.initIdentityScope(type);

        tblTaskDao = new TblTaskDao(tblTaskDaoConfig, this);

        registerDao(TblTask.class, tblTaskDao);
    }
    
    public void clear() {
        tblTaskDaoConfig.clearIdentityScope();
    }

    public TblTaskDao getTblTaskDao() {
        return tblTaskDao;
    }

}
