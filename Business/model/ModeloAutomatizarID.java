package model;

import java.util.ArrayList;

public class ModeloAutomatizarID <T>{
	
	
	public ModeloAutomatizarID() {
	}
	
			

	
	
	public int gerarID( ArrayList<T> array, T objectT) {
		int num = 1;
		
		for(int i = 0; i < array.size();i++ ) {
			if(array.get(i).hashCode() != objectT.hashCode()) {
				num += array.get(i).hashCode();
			}
			
		}
		return num;
	}
}
