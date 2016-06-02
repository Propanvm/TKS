package br.ufrpe.tks.exceptions;

public class UsuarioJaCadastradoException extends Exception{
	private int matricula;
	public UsuarioJaCadastradoException(int matricula){
		super("O usu�rio com matr�cula: " + matricula + " j� est� cadastrado.");
		this.matricula = matricula;
	}
	public int getMatricula(){
		return matricula;
	}
}
