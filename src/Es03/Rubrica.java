package Es03;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
	private String Nome;
	private String telefono;
	Map<String, Rubrica> contatti = new HashMap<>();

	public Rubrica(String nom, String tel) {
		this.setNome(nom);
		this.setTelefono(tel);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void inserisci(Map<String, Rubrica> x, Rubrica y) {
		x.put(y.getNome(), y);
	}

	public void rimuovi(Map<String, Rubrica> x, Rubrica y) {
		x.remove(y.getNome(), y);
	}

	public void trovaPerNum(Map<String, Rubrica> x, Rubrica y) {
		x.remove(y.getNome(), y);
	}

	public void trovaPerNom(Map<String, Rubrica> x, Rubrica y) {
		x.remove(y.getNome(), y);
	}

	public void stampa(Map<String, Rubrica> x) {
		for (iterable_type iterable_element : iterable) {

		}
	}
}
