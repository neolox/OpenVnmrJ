/*
 * Copyright (C) 2015  University of Oregon
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the LICENSE file.
 *
 * For more information, see the LICENSE file.
 */

package  vnmr.bo;

/**
 * param identifier
 *
 * @author Glenn Sullivan
 */
public class ShimSet extends ID {
    /**
     * constructor
     */
    public ShimSet(String id) {
	super(id);
    } // Macro()

    /**
     * Get param name. For now, just use the id for the name.
     * @return name
     */
    public String getName() {
	return id;
    } // getName()

    /**
     * indicates whether the given object is equal to this one
     * @return boolean
     */
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (id != null && obj instanceof ShimSet)
	    return id.equals(((ShimSet)obj).id);
	return false;
    } // equals()

} // class Macro
