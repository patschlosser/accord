/**
 * Neociclo Accord, Open Source B2Bi Middleware
 * Copyright (C) 2005-2010 Neociclo, http://www.neociclo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * $Id$
 */
package org.neociclo.odetteftp.oftplet;

import org.neociclo.odetteftp.protocol.EndSessionReason;

/**
 * @author Rafael Marins
 * @version $Rev$ $Date$
 */
public class EndSessionReasonInfo {

    private EndSessionReason endSessionReason;
    private String reasonText;

    public EndSessionReasonInfo(EndSessionReason reason) {
        this(reason, null);
    }

    public EndSessionReasonInfo(EndSessionReason endSessionReason, String reasonText) {
        super();
        if (endSessionReason == null) {
            throw new NullPointerException("endSessionReason");
        }
        this.endSessionReason = endSessionReason;
        this.reasonText = reasonText;
    }

    public EndSessionReason getEndSessionReason() {
        return endSessionReason;
    }

    public String getReasonText() {
        return reasonText;
    }

}