/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.macroxinux.mesh.api;

import java.util.Map;

/**
 *
 * @author drew
 */
public interface Mesh extends Node {
    @Override
    Map<Line, Double> get();
        
}
