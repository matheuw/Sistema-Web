package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.*;

import org.hibernate.HibernateException;

import util.HibernateUtil;

public abstract class DAO<T> {

	private org.hibernate.Session session;
	private Class<T> clazz;

	protected DAO(Class<T> clazz) {
		session = HibernateUtil.getSession();
		this.clazz = clazz;
	}

	public T load(Serializable id) throws DAOException {

		try {
			return (T) session.load(clazz, id);
		} catch (HibernateException e) {
			throw new DAOException(e);
		}

	}

	public void save(T obj) throws DAOException {
		try {
			session.save(obj);
		} catch (HibernateException e) {
			throw new DAOException(e);
		}

	}
	
	public void delete(T obj) throws DAOException {
		try {
			session.delete(obj);
		} catch (HibernateException e) {
			throw new DAOException(e);
		}

	}

	protected List<?> list(String hql) throws DAOException {
		try {
			Query q = session.createQuery(hql);
			return q.list();
		} catch (HibernateException e) {
			throw new DAOException(e);
		}

	}

}
