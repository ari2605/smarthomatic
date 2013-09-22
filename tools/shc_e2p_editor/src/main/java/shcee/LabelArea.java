/*
* This file is part of smarthomatic, http://www.smarthomatic.org.
* Copyright (c) 2013 Uwe Freese
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

package shcee;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.UIManager;

/**
 * LabelArea behaves like a JLabel with word wrap.
 * @author uwe
 */
public class LabelArea extends JTextArea
{
	private static final long serialVersionUID = 1756401019028250790L;

	public LabelArea(String text) {
        super(text);
        setBackground(null);
        setEditable(false);
        //setBorder(null);
        setLineWrap(true);
        setWrapStyleWord(true);
        setFocusable(false);
        
        Font font = UIManager.getDefaults().getFont("JLabel.font");
        setFont(font);
    }
}
