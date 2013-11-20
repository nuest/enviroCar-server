/*
 * Copyright (C) 2013 The enviroCar project
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
 */
package org.envirocar.server.core.event;

import org.envirocar.server.core.entities.Phenomenon;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann <autermann@uni-muenster.de>
 */
public class CreatedPhenomenonEvent implements PhenomenonEvent {
    private final Phenomenon phenomenon;

    public CreatedPhenomenonEvent(Phenomenon phenomenon) {
        this.phenomenon = phenomenon;
    }

    @Override
    public Phenomenon getPhenomenon() {
        return phenomenon;
    }
}
