/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Eclipse Distribution License 1.0
 * which is available at http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lyo.oslc4j.core.test;

import java.net.URISyntaxException;

import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreMissingAnnotationException;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.test.resources.MissingResourceShapeAnnotation;
import org.junit.Test;

public class ShapeTest {
	@Test(expected = OslcCoreMissingAnnotationException.class)
	public void testResourceClassMissingResourceShapeAnnotation()
		   throws OslcCoreApplicationException,
				  URISyntaxException
	{
		ResourceShapeFactory.createResourceShape("http://bogus",
												 OslcConstants.PATH_RESOURCE_SHAPES,
												 "bogus",
												 MissingResourceShapeAnnotation.class);
	}
}
