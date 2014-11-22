/**
 * GC-Profiler
 * Copyright (C) 2014-2015  Stefan Leonhartsberger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * License can be found in project root: LICENSE
 */
package model;

import model.types.CollectionType;

/**
 * Created by SLeonhar on 22.11.2014.
 */
public abstract class GCPause {

    //The total pause time
    public int pauseTimeSec = 0;

    //The type of the collection
    public CollectionType type = CollectionType.UNDEFINED;

    //The times attribute (user,sys,real)
    public Times collectionTimes = null;

    public GCPause(final String value) {

    }



    public int getPauseTimeSec() {
        return pauseTimeSec;
    }

    public void setPauseTimeSec(int pauseTimeSec) {
        this.pauseTimeSec = pauseTimeSec;
    }

    public CollectionType getType() {
        return type;
    }

    public void setType(CollectionType type) {
        this.type = type;
    }

    public Times getCollectionTimes() {
        return collectionTimes;
    }

    public void setCollectionTimes(Times collectionTimes) {
        this.collectionTimes = collectionTimes;
    }

    @Override
    public String toString() {
        return "GCPause{" +
                "pauseTimeSec=" + pauseTimeSec +
                ", type=" + type +
                ", collectionTimes=" + collectionTimes +
                '}';
    }
}
