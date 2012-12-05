package org.unioeste.ilp.models;

import java.util.List;
import org.unioeste.ilp.models.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table patterns.
 */
public class Pattern {

    private Long id;
    /** Not-null value. */
    private String pattern_sha1;
    /** Not-null value. */
    private String pattern_string;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PatternDao myDao;

    private List<Experience> experiences;

    public Pattern() {
    }

    public Pattern(Long id) {
        this.id = id;
    }

    public Pattern(Long id, String pattern_sha1, String pattern_string) {
        this.id = id;
        this.pattern_sha1 = pattern_sha1;
        this.pattern_string = pattern_string;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPatternDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getPattern_sha1() {
        return pattern_sha1;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPattern_sha1(String pattern_sha1) {
        this.pattern_sha1 = pattern_sha1;
    }

    /** Not-null value. */
    public String getPattern_string() {
        return pattern_string;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPattern_string(String pattern_string) {
        this.pattern_string = pattern_string;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public synchronized List<Experience> getExperiences() {
        if (experiences == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ExperienceDao targetDao = daoSession.getExperienceDao();
            experiences = targetDao._queryPattern_Experiences(id);
        }
        return experiences;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetExperiences() {
        experiences = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}