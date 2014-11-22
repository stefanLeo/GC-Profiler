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
import model.Times;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SLeonhar on 22.11.2014.
 */
public class TimesTests {

    @Test
    public void testTimesSimple(){
        Times times = new Times("[Times: user=0.59 sys=0.02, real=0.16 secs]");

        Assert.assertTrue("User = 0.59", times.getUserTime() == 0.59);
        Assert.assertTrue("SYS = 0.59", times.getSysTime() == 0.02);
        Assert.assertTrue("Real = 0.59", times.getRealTime() == 0.16);
    }

    @Test
    public void testTimesSimple2(){
        Times times = new Times("[ Times: user=0.31 sys=0.00, real=0.08 sec]");

        Assert.assertTrue("User = 0.31", times.getUserTime() == 0.31);
        Assert.assertTrue("SYS = 0.00", times.getSysTime() == 0.);
        Assert.assertTrue("Real = 0.08", times.getRealTime() == 0.08);
    }
}
