/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.macroxinux.mesh.api;

import java.io.Serializable;

/**
 *
 * @author drew
 */
public abstract interface MeshObject extends Serializable {
    
    Object getContent();
    
}
