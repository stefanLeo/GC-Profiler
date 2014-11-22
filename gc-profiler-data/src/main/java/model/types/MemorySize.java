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
package model.types;

/**
 * Created by SLeonhar on 22.11.2014.
 */
public enum MemorySize {
    BYTE("B"),
    KB("K"),
    MB("M"),
    GB("G"),
    UNDEFINED("U");

    private String matchType = null;

    MemorySize(final String type) {
        this.matchType = type;
    }

    @Override
    public String toString() {
        return "MemorySize{" +
                "matchType='" + matchType + '\'' +
                '}';
    }
}
