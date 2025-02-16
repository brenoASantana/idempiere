/******************************************************************************
 * Product: Posterita Ajax UI 												  *
 * Copyright (C) 2007 Posterita Ltd.  All Rights Reserved.                    *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Posterita Ltd., 3, Draper Avenue, Quatre Bornes, Mauritius                 *
 * or via info@posterita.org or http://www.posterita.org/                     *
 *****************************************************************************/

package org.adempiere.webui.event;

/**
 * Value change event for a named property.
 * @author  <a href="mailto:agramdass@gmail.com">Ashley G Ramdass</a>
 * @date    Mar 10, 2007
 */
public class ValueChangeEvent
{

    /**
     * The object on which the Event initially occurred.
     */
    protected Object source;

    /**
     * name of the property that changed
     */
    private String   propertyName;

    /**
     * New value for property. May be null if not known.
     */
    private Object   newValue;

    /**
     * Previous value for property. May be null if not known.
     */
    private Object   oldValue;
    
	// IDEMPIERE-1287:indicate case user just start edit field, want update status of toolbar button (like save button) 
	// but don't want change anything (even value of edit field)
    private boolean   isInitEdit = false;

    /**
     * @param source
     * @param propertyName
     * @param oldValue
     * @param newValue
     */
    public ValueChangeEvent(Object source, String propertyName,
            Object oldValue, Object newValue)
    {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
        this.oldValue = oldValue;
    }

    /**
     * Get new value
     * @return new value
     */
    public Object getNewValue()
    {
        return newValue;
    }

    /**
     * Get old value
     * @return old/previous value
     */
    public Object getOldValue()
    {
        return oldValue;
    }

    /**
     * Get property name
     * @return property name
     */
    public String getPropertyName()
    {
        return propertyName;
    }

    /**
     * Get event source
     * @return event source object
     */
    public Object getSource()
    {
        return source;
    }

	/**
	 * Is initial edit that have not been completed yet
	 * @return indicate this event is by user start edit this field but not yet complete edit
	 */
	public boolean isInitEdit() {
		return isInitEdit;
	}

	/**
	 * @param isInitEdit indicate this event is by user start edit this field but not yet complete edit
	 */
	public void setIsInitEdit(boolean isInitEdit) {
		this.isInitEdit = isInitEdit;
	}
}
