package br.ufrpe.tks.exceptions;

public class UsuarioNaoEncontradoException extends Exception{
	private int matricula;
	public UsuarioNaoEncontradoException(int matricula){
		super("O usu�rio com matricula: " + matricula + " n�o foi encontrado");
		this.matricula = matricula;
	}
	public int getMatricula(){
		return matricula;
	}
}
