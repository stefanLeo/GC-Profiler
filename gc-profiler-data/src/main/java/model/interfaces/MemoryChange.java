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
package model.interfaces;

import model.types.MemorySize;
import model.types.MemoryType;

/**
 * Created by SLeonhar on 22.11.2014.
 */
public class MemoryChange {

    public double beforeOccupancy           = 0.0;
    public double afterOccupancy            = 0.0;
    public double beforeCapacity            = 0.0;
    public double afterCapacity             = 0.0;

    public MemoryType memoryType            = MemoryType.UNDEFINED;

    public MemorySize beforeOccupancyUnit   = MemorySize.UNDEFINED;
    public MemorySize afterOccupancyUnit    = MemorySize.UNDEFINED;
    public MemorySize beforeCapacityUnit    = MemorySize.UNDEFINED;
    public MemorySize afterCapacityUnit     = MemorySize.UNDEFINED;

    public MemoryChange(final String value) {
        parseValue(value);
    }

    protected void parseValue(final String value){

    }

    public double getBeforeOccupancy() {
        return beforeOccupancy;
    }

    public void setBeforeOccupancy(double beforeOccupancy) {
        this.beforeOccupancy = beforeOccupancy;
    }

    public double getAfterOccupancy() {
        return afterOccupancy;
    }

    public void setAfterOccupancy(double afterOccupancy) {
        this.afterOccupancy = afterOccupancy;
    }

    public double getBeforeCapacity() {
        return beforeCapacity;
    }

    public void setBeforeCapacity(double beforeCapacity) {
        this.beforeCapacity = beforeCapacity;
    }

    public double getAfterCapacity() {
        return afterCapacity;
    }

    public void setAfterCapacity(double afterCapacity) {
        this.afterCapacity = afterCapacity;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    public MemorySize getBeforeOccupancyUnit() {
        return beforeOccupancyUnit;
    }

    public void setBeforeOccupancyUnit(MemorySize beforeOccupancyUnit) {
        this.beforeOccupancyUnit = beforeOccupancyUnit;
    }

    public MemorySize getAfterOccupancyUnit() {
        return afterOccupancyUnit;
    }

    public void setAfterOccupancyUnit(MemorySize afterOccupancyUnit) {
        this.afterOccupancyUnit = afterOccupancyUnit;
    }

    public MemorySize getBeforeCapacityUnit() {
        return beforeCapacityUnit;
    }

    public void setBeforeCapacityUnit(MemorySize beforeCapacityUnit) {
        this.beforeCapacityUnit = beforeCapacityUnit;
    }

    public MemorySize getAfterCapacityUnit() {
        return afterCapacityUnit;
    }

    public void setAfterCapacityUnit(MemorySize afterCapacityUnit) {
        this.afterCapacityUnit = afterCapacityUnit;
    }

    @Override
    public String toString() {
        return "MemoryChange{" +
                "beforeOccupancy=" + beforeOccupancy +
                ", afterOccupancy=" + afterOccupancy +
                ", beforeCapacity=" + beforeCapacity +
                ", afterCapacity=" + afterCapacity +
                ", memoryType=" + memoryType +
                ", beforeOccupancyUnit=" + beforeOccupancyUnit +
                ", afterOccupancyUnit=" + afterOccupancyUnit +
                ", beforeCapacityUnit=" + beforeCapacityUnit +
                ", afterCapacityUnit=" + afterCapacityUnit +
                '}';
    }
}
