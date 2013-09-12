/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;


/**
 *
 * @author AMILA
 */
public class InvalidNicException extends Exception {
    
    public InvalidNicException() {
		super("Invalid NIC number has entered");
	}
    
}
