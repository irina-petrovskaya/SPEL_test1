package com.springeltests.operators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("numberBean")
public class Number {

	@Value("999")
	private int nom;

    @Value("#{'foo'.contains('f')}")
    private boolean boo1;

    public boolean isBoo1() {
        return boo1;
    }

    public void setBoo1(boolean boo) {
        this.boo1 = boo;
    }

    public int getNom() {
		return nom;
	}

	public void setNom(int no) {
		this.nom = no;
	}

}
