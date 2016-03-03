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
	 * Sauvegarde en BDD l'entité passé en parametre.
	 * 
	 * @param emp à persister
	 * @return l'entité rafraichit
	 */
	public T persist(final T emp);
	
    /**
     * Supprime de la base l'entité passé en parametre.
     * 
     * @param emp à supprimer
     */
    public void delete(final T emp);
    
    /**
     * Modifie une entité déja existante.
     * 
     * @param emp à merger
     * @return l'entité rafraichit
     */
    public void merge(final T emp);
    
    
    /**
     * Renvoie l'entité dont l'id est passé en parametre.
     * 
     * @param empId id sur lequel se base la recherche
     * @return l'entité si trouvé sinon null
     */
    public T read(final Long empId);
	
}
