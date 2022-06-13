package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MyOperationTwoImplements implements MyOperationTwo{

	@Override
	public int resta(int number) {
		return --number;
	}

}
