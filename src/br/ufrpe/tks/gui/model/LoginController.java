package br.ufrpe.tks.gui.model;

import br.ufrpe.tks.dados.IRepositorioPessoa;
import br.ufrpe.tks.dados.RepositorioPessoa;
import br.ufrpe.tks.exceptions.LoginIncorretoException;
import br.ufrpe.tks.exceptions.SenhaIncorretaException;
import br.ufrpe.tks.exceptions.UsuarioNaoEncontradoException;
import br.ufrpe.tks.gui.MainApp;
import br.ufrpe.tks.negocios.CadastroPessoa;
import br.ufrpe.tks.negocios.beans.Funcionario;
import br.ufrpe.tks.negocios.beans.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField campoMatricula;
	@FXML
	private PasswordField campoSenha;
	@FXML
	private Button btEntrar;
	@FXML
	private Label lbErro;

	private MainApp mainApp;
	private Pessoa logado;

	IRepositorioPessoa repositorioPessoa = RepositorioPessoa.getInstance();
	CadastroPessoa cadastroPessoa = new CadastroPessoa(repositorioPessoa);

	public LoginController() {

	}

	@FXML
	private void initialize() {

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void handleLogin() {
		if (campoMatricula.getText().equals("") || campoSenha.getText().equals("")) {
			lbErro.setText("Matr�cula e/ou senha n�o preenchido");
		} else {
			try {
				cadastroPessoa.login(campoMatricula.getText(), campoSenha.getText());
				logado = cadastroPessoa.procurar(campoMatricula.getText());
				mainApp.showFuncionario((Funcionario) logado);
			} catch (LoginIncorretoException e) {
				lbErro.setText(e.getMessage());
			} catch (SenhaIncorretaException e) {
				lbErro.setText(e.getMessage());
			} catch (UsuarioNaoEncontradoException e) {
				lbErro.setText(e.getMessage());
			}
		}
	}
}
