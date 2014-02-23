/*

Server :: Edge is a @RelationshipEntity 




 */

package org.macroxinux.mesh.api;

import java.io.Serializable;

/**
 *
 * @author drew
 */
public abstract interface Edge extends Serializable {

    Node getFrom();
    Node getTo();
    
    
}
