/**
 * 
 */
package com.app.izidevtools.persist.dao;

/**
 * @author frus64150
 *
 */
public interface GenericDAO<T> {

	/**
	 * Sauvegarde en BDD l'entit� pass� en parametre.
	 * 
	 * @param emp � persister
	 * @return l'entit� rafraichit
	 */
	public T persist(final T emp);
	
    /**
     * Supprime de la base l'entit� pass� en parametre.
     * 
     * @param emp � supprimer
     */
    public void delete(final T emp);
    
    /**
     * Modifie une entit� d�ja existante.
     * 
     * @param emp � merger
     * @return l'entit� rafraichit
     */
    public void merge(final T emp);
    
    
    /**
     * Renvoie l'entit� dont l'id est pass� en parametre.
     * 
     * @param empId id sur lequel se base la recherche
     * @return l'entit� si trouv� sinon null
     */
    public T read(final Long empId);
	
}
