/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

import static org.junit.Assert.*;



import org.junit.Test;
/**
 *
 * @author Gary
 */
class MultiplyTest {
    
	public void Multiply() {

		

		junit test = new  junit();

		int result = test.multiply(3, 4);

		assertEquals(12, result);

		

	}
}
