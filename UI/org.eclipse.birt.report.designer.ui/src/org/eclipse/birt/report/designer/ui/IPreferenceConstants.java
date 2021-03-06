/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.ui;

/**
 * The default setting for palette
 *  
 */

public interface IPreferenceConstants
{

	/**
	 * the doc location
	 */
	static final String PALETTE_DOCK_LOCATION = "Dock location"; //$NON-NLS-1$

	/**
	 * the palette size
	 */
	static final String PALETTE_SIZE = "Palette Size"; //$NON-NLS-1$

	/**
	 * the palette state
	 */
	static final String PALETTE_STATE = "Palette state"; //$NON-NLS-1$

	/**
	 * the default palette size
	 */
	static final int DEFAULT_PALETTE_SIZE = 130;

	/**
	 * the default palette state
	 */
	static final int DEFAULT_PALETTE_STATE = 2;

	/**
	 * the default palette category
	 */
	static final String PALETTE_CONTENT = "Content"; //$NON-NLS-1$

	/**
	 * the AutoText palette category for MasterPage Designer
	 */
	static final String PALETTE_AUTOTEXT = "Autotext"; //$NON-NLS-1$
}