package com.ritesh;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;


@Stateless 
@LocalBean
public class Addition implements AdditionRemote {
	
	public int add(int a,int b) {
		return a+b;
		}
}
