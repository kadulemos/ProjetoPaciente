package br.com.animati;

import java.util.List;

public interface PacienteCrud {
	
	public void add(Paciente p) throws Exception;
	public void edit(Paciente p);
	public List<Paciente> list();
	public void delete(long idPaciente);
	public Paciente findById(long idPaciente);
	
}