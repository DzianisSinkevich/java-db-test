package com.danco.bpc.entity.api;

/**
 * The Abstract Class AbstractBaseEntity.
 *
 * @author dzmitry_dubrovin
 * 
 */
public abstract class AbstractBaseEntity implements IBaseEntity {

    /** The generated constant serialVersionUID. */
	private static final long serialVersionUID = 2935309511831531001L;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ! (o instanceof AbstractBaseEntity)){
        	return false;
        }
        
        if ( ! o.getClass().equals(this.getClass())){
        	return false;
        }
        
        Long id = getId();
        AbstractBaseEntity that = (AbstractBaseEntity) o;
        
        if(id == null) return false;
        
        if (id != null ? !id.equals(that.getId()) : that.getId() != null) return false;

        return true;
    }
	

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
    	Long id = getId();
        return id != null ? id.hashCode() : 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getName());
        sb.append(" id = ").append(getId());
        return sb.toString();
    }
}