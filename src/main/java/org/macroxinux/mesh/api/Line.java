/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.macroxinux.mesh.api;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author drew
 */
public interface Line extends Node {
    
    @Override 
    Iterator<Map<Edge, Node>> get();
    
    
    
}
