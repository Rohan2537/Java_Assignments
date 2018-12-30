package com.capgemini.java.assignmentsecond.model;

public class RemoveSpacesAndDeleteWord {

	public static void main(String[] args) {

		 	String str = "hi, How     are you?. are you there?";
		    String strToRemove = "are";
		    StringBuilder stringBuilder = new StringBuilder();
		    stringBuilder.append(str);
		    boolean status=true;
		    while (status){
		        int index=stringBuilder.indexOf(strToRemove);
		        if(index!=-1) {
		            stringBuilder.delete(index, index + strToRemove.length()+1);
		            
		        }else {
		            status=false;
		        }
		  }
		 
	}

}


