package br.ufrpe.tks.exceptions;

public class UsuarioJaCadastradoException extends Exception{
	private String matricula;
	public UsuarioJaCadastradoException(String matricula){
		super("O usu�rio com matr�cula: " + matricula + " j� est� cadastrado.");
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}
}
