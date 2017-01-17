/*
 * Copyright (C) 2016 Yann D'Isanto
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.mytdev.nbmongo.module.install;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.EditorKit;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.openide.modules.ModuleInstall;

/**
 *
 * @author Yann D'Isanto
 */
public class ModuleInstaller extends ModuleInstall {
    
    private static final long serialVersionUID = 1L;
    
    private static final Logger LOG = Logger.getLogger(ModuleInstaller.class.getName());
    
    @Override
    protected void initialize() {
        LOG.info("initializing nbmongo app");
        super.initialize();
    }

    @Override
    public void uninstalled() {
        super.uninstalled();
    }

    @Override
    public void restored() {
        EditorKit editorKit = MimeLookup.getLookup("text/x-json").lookup(EditorKit.class);
        LOG.log(Level.INFO, "json editor kit: {0}", editorKit);
        super.restored();
    }

    @Override
    public void validate() throws IllegalStateException {
        super.validate();
    }
    
    
    
}
