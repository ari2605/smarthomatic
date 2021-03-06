/*
* This file is part of smarthomatic, http://www.smarthomatic.org.
* Copyright (c) 2013 Stefan Baumann
*               2015 Uwe Freese
*
* smarthomatic is free software: you can redistribute it and/or modify it
* under the terms of the GNU General Public License as published by the
* Free Software Foundation, either version 3 of the License, or (at your
* option) any later version.
*
* smarthomatic is distributed in the hope that it will be useful, but
* WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
* Public License for more details.
*
* You should have received a copy of the GNU General Public License along
* with smarthomatic. If not, see <http://www.gnu.org/licenses/>.
*/

#include "../src_common/util.h"

/*
 * Starts humidity measurement and returns the result in
 * 1/10000 (divide by 100 to get a percentage relative humidity).
 */
uint16_t sht2x_htu21d_meas_hum(void);

/*
 * Starts temperature measurement and returns the result in
 * 1/100 degree celsius.
 */
int16_t sht2x_htu21d_meas_temp(void);
