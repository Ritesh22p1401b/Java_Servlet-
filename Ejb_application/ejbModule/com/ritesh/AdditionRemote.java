package com.ritesh;

import jakarta.ejb.Remote;

@Remote
public interface AdditionRemote {
	public int add(int a,int b);
}

