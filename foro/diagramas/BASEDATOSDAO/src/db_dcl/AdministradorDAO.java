/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: aba693(University of Almeria)
 * License Type: Academic
 */
package db_dcl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AdministradorDAO {
	public static Administrador loadAdministradorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getAdministradorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return getAdministradorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Administrador) session.load(db_dcl.Administrador.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Administrador) session.get(db_dcl.Administrador.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.load(db_dcl.Administrador.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.get(db_dcl.Administrador.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From db_dcl.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador createAdministrador() {
		return new db_dcl.Administrador();
	}
	
	public static boolean save(db_dcl.Administrador administrador) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().saveObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(db_dcl.Administrador administrador) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().deleteObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(db_dcl.Administrador administrador)throws PersistentException {
		try {
			db_dcl.Ticket[] lPro_ticketss = administrador.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			db_dcl.Mensaje[] lPro_mensajess = administrador.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			db_dcl.Usuarios[] lUsuarioss = administrador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(administrador);
			}
			db_dcl.Tema[] lPro_temass = administrador.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			db_dcl.Seccion[] lPro_seccioness = administrador.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			db_dcl.Notificacion[] lNotificacioness = administrador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			db_dcl.Usuarios[] lUsuariosAmigoss = administrador.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(administrador);
			}
			return delete(administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(db_dcl.Administrador administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			db_dcl.Ticket[] lPro_ticketss = administrador.pro_tickets.toArray();
			for(int i = 0; i < lPro_ticketss.length; i++) {
				lPro_ticketss[i].setUsuarios(null);
			}
			db_dcl.Mensaje[] lPro_mensajess = administrador.pro_mensajes.toArray();
			for(int i = 0; i < lPro_mensajess.length; i++) {
				lPro_mensajess[i].setUsuarios(null);
			}
			db_dcl.Usuarios[] lUsuarioss = administrador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].usuariosAmigos.remove(administrador);
			}
			db_dcl.Tema[] lPro_temass = administrador.pro_temas.toArray();
			for(int i = 0; i < lPro_temass.length; i++) {
				lPro_temass[i].setUsuarios(null);
			}
			db_dcl.Seccion[] lPro_seccioness = administrador.pro_secciones.toArray();
			for(int i = 0; i < lPro_seccioness.length; i++) {
				lPro_seccioness[i].setUsuarios(null);
			}
			db_dcl.Notificacion[] lNotificacioness = administrador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].setUsuarios(null);
			}
			db_dcl.Usuarios[] lUsuariosAmigoss = administrador.usuariosAmigos.toArray();
			for(int i = 0; i < lUsuariosAmigoss.length; i++) {
				lUsuariosAmigoss[i].usuarios.remove(administrador);
			}
			try {
				session.delete(administrador);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(db_dcl.Administrador administrador) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().refresh(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(db_dcl.Administrador administrador) throws PersistentException {
		try {
			db_dcl.MDS11920PFBlancoRoblesPersistentManager.instance().getSession().evict(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		Administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static Administrador[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
