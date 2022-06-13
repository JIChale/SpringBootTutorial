package com.fundamentosPlatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola Mundo desde el componente DOS......");
    }

	public void charlar() {
		System.out.println("Ahora venimos hablar de los MS");
	}
}
