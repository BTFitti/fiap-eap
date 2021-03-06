package br.com.fiap.jpa;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.PersistenceManager;
import br.com.fiap.jpa.dao.impl.AlunoDAOImpl;
import br.com.fiap.jpa.entity.Aluno;
import br.com.fiap.jpa.entity.Disciplina;
import br.com.fiap.jpa.entity.Endereco;
import br.com.fiap.jpa.service.impl.AlunoServiceImpl;
import br.com.fiap.jpa.service.impl.DisciplinaServiceImpl;

public class App {

	public static void main(String[] args) {
		AlunoServiceImpl alunoService = AlunoServiceImpl.getInstance();
		DisciplinaServiceImpl disciplinaService = DisciplinaServiceImpl.getInstance();

		Aluno aluno3 = new Aluno("Aluno3", "33333", "333.333.333-33", LocalDate.of(1980, 1, 1));
		alunoService.inserir(new Aluno("Aluno1", "11111", "111.111.111-11", LocalDate.of(1980, 1, 1)));
		alunoService.inserir(new Aluno("Aluno2", "22222", "222.222.222-22", LocalDate.of(1980, 1, 1)));
		
		Disciplina disciplina2 = new Disciplina("Ciencias",350);
		disciplinaService.inserir(new Disciplina("Matematica",500));
		disciplinaService.inserir(new Disciplina("Hist?ria",200));
		disciplinaService.inserir(disciplina2);

		Endereco endereco = new Endereco("Av.Paulista", 777, "5 andar ", "Bela Vista", "S?o Paulo", "SP", "04566-333");
		
		alunoService.inserirComEndereco(aluno3, endereco);
		
		Aluno aluno = alunoService.obter(3L);
		
		System.out.println(aluno);
		
		

	}
}
