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
package org.eclipse.lyo.trs.client.exceptions;

/**
 * Thrown normally by a TRS Provider when the last change event which was processed can not be found
 * in the list of change logs which was retrieved from the server meaning probably that the server
 * has been rolled back to a state previous to that change event
 *
 * @since 2.3.0
 */
public class ServerRollBackException extends RuntimeException {

    private static final long serialVersionUID = -5190311252768510792L;

    public ServerRollBackException(String string) {
        super(string);
    }

}
