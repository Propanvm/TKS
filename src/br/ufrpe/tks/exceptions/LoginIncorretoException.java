package br.ufrpe.tks.exceptions;

public class LoginIncorretoException extends Exception{
	public LoginIncorretoException(){
		super("N�mero da matr�cula incorreto");
	}
}
