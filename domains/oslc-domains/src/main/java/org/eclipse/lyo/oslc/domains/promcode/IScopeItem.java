// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 *
 * This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
 */
// End of user code

package org.eclipse.lyo.oslc.domains.promcode;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import org.eclipse.lyo.oslc.domains.promcode.Oslc_promcodeDomainConstants;
import org.eclipse.lyo.oslc.domains.promcode.Oslc_promcodeDomainConstants;
import org.eclipse.lyo.oslc.domains.promcode.IScopeItem;
// Start of user code imports
// End of user code

@OslcNamespace(Oslc_promcodeDomainConstants.SCOPEITEM_NAMESPACE)
@OslcName(Oslc_promcodeDomainConstants.SCOPEITEM_LOCALNAME)
@OslcResourceShape(title = "ScopeItem Shape", description = "A ScopeItem defines the work to be included in or excluded from a project. It defines the boundaries of the project", describes = Oslc_promcodeDomainConstants.SCOPEITEM_TYPE)
public interface IScopeItem
{


    @OslcName("actualSize")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "actualSize")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Float)
    @OslcReadOnly(false)
    public Float getActualSize();

    @OslcName("isPartOf")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "isPartOf")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_promcodeDomainConstants.SCOPEITEM_TYPE})
    @OslcReadOnly(false)
    public Link getIsPartOf();

    @OslcName("plannedSize")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "plannedSize")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Float)
    @OslcReadOnly(false)
    public Float getPlannedSize();


    public void setActualSize(final Float actualSize );
    public void setIsPartOf(final Link isPartOf );
    public void setPlannedSize(final Float plannedSize );
}
