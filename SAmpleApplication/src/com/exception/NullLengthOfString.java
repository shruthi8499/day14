package com.exception;
import com.exception.*;
public class NullLengthOfString extends Exception{
	int s=0;
	public NullLengthOfString(String p) {
		s=p.length();
	}
	public void printmessage() {
		System.out.println("invalid text");
	}

}
