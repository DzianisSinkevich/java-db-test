package com.danco.bpc.entity.api;

import java.io.Serializable;


/**
 * The Interface BaseEntity.
 *  
 * @author dzmitry_dubrovin
 *
 */
public interface IBaseEntity extends Serializable {

	 /**
     * Gets the entity id.
     *
     * @return the id
     */
    public Long getId();

    /**
     * Sets the entity id.
     *
     * @param id the new id
     */
    public void setId(Long id);
	
}
