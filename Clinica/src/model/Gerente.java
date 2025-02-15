package model;

import java.sql.Date;
import java.time.LocalDate;

import dao.GerenteDAO;
import dao.ExceptionDAO;

public class Gerente extends Funcionario {
    private int idGerente;
    private int idFuncionario;

    public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String telefone, String rg, String cpf, LocalDate dataNascimento, String sexo,
			String profissao, String endereco) {
		super(nome, telefone, rg, cpf, dataNascimento, sexo, profissao, endereco);
		// TODO Auto-generated constructor stub
	}

	public Gerente(String login, String senha, String cargo) {
		super(login, senha, cargo);
	}

	public Gerente(int idFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
	}

	public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public void createGerente(Gerente Gerente) throws ExceptionDAO {
        new GerenteDAO().createGerente(Gerente);
    }

    public void updateGerente(Gerente Gerente) throws ExceptionDAO {
        new GerenteDAO().updateGerente(Gerente);
    }

    public void deleteGerente(int idGerente) throws ExceptionDAO {
        new GerenteDAO().deleteGerente(idGerente);
    }

}
