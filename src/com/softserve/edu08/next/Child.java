package com.softserve.edu08.next;

import com.softserve.edu08.Parent;

public class Child extends Parent {
	
    // @Override
	public int f() {
		return 2;
	}
	
	public int useF2() {
		return useF();
	}
}
