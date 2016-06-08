package br.ufrpe.tks.exceptions;

public class UsuarioNaoEncontradoException extends Exception{
	private String matricula;
	public UsuarioNaoEncontradoException(String matricula){
		super("O usu�rio com matricula: " + matricula + " n�o foi encontrado");
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}
}
