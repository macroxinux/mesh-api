/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.macroxinux.mesh.api;

/**
 *
 * @author drew
 */
public interface LineEdge extends Edge {
    
    @Override
    Item getFrom();
    
    @Override
    Item getTo();
    
    boolean isHard();
    
       
    
}
