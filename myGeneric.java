package cacheProject;

import java.io.Serializable;

public class myGeneric <T extends Serializable> {
	T t;
	myGeneric(T t){
		this.t=t;
	}

	public void print() {
		System.out.println(t);
	}
}
