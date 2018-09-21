/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.cui.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.cui.fulfilmentprocess.constants.CuiFulfilmentProcessConstants;

public class CuiFulfilmentProcessManager extends GeneratedCuiFulfilmentProcessManager
{
	public static final CuiFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CuiFulfilmentProcessManager) em.getExtension(CuiFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
