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

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by SLeonhar on 22.11.2014.
 */
public class Times {

    private static final Logger LOG = LogManager.getLogger(Times.class);

    private double userTime = 0.0;
    private double sysTime  = 0.0;
    private double realTime = 0.0;

    public Times(double userTime, double sysTime, double realTime) {
        this.userTime = userTime;
        this.sysTime = sysTime;
        this.realTime = realTime;
    }

    public Times(String value) {
        parseValue(value);
    }

    protected void parseValue(final String value){
        try {
            setUserTime(Double.parseDouble(StringUtils.substringBetween(value, "user=", " ")));
            setSysTime(Double.parseDouble(StringUtils.substringBetween(value, "sys=", ",")));
            setRealTime(Double.parseDouble(StringUtils.substringBetween(value, "real=", " ")));
            LOG.info("Successfully parsed Times: " + this);
        } catch (final Exception ex){
            LOG.error("Error parsing TIMES: ", ex);
        }
    }

    public double getUserTime() {
        return userTime;
    }

    public void setUserTime(double userTime) {
        this.userTime = userTime;
    }

    public double getSysTime() {
        return sysTime;
    }

    public void setSysTime(double sysTime) {
        this.sysTime = sysTime;
    }

    public double getRealTime() {
        return realTime;
    }

    public void setRealTime(double realTime) {
        this.realTime = realTime;
    }

    @Override
    public String toString() {
        return "Times{" +
                "userTime=" + userTime +
                ", sysTime=" + sysTime +
                ", realTime=" + realTime +
                '}';
    }
}
