package Es03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Rubrica {
	private String Nome;
	private String telefono;
	Map<String, String> contatti = new HashMap<>();

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

	public void inserisci(String nome, String telefono) {
		this.contatti.put(nome, telefono);
	}

	public void rimuovi(String nome) {
		for (Iterator<Map.Entry<String, String>> iterator = contatti.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<String, String> entry = iterator.next();
			if (entry.getKey().equals(nome)) {
				iterator.remove();
			}
		}
	}

	public void trovaPerNum(String telefono) {
		System.out.println("Il contatto che hai cercato:");
		for (Iterator<Map.Entry<String, String>> iterator = contatti.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<String, String> entry = iterator.next();
			if (entry.getValue().equals(telefono)) {
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println("Nome: " + key + ", Numero di telefono: " + value.toString());
			}
		}
	}

	public void trovaPerNom(String nome) {
		System.out.println("Il contatto che hai cercato:");
		for (Iterator<Map.Entry<String, String>> iterator = contatti.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<String, String> entry = iterator.next();
			if (entry.getKey().equals(nome)) {
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println("Nome: " + key + ", Numero di telefono: " + value.toString());
			}
		}
	}

	public void stampa() {
		System.out.println("Questa è la rubrica di: " + this.getNome() + " " + "con il numero: " + this.getTelefono());
		System.out.println("Lista Contatti:");
		for (Map.Entry<String, String> entry : this.contatti.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Nome: " + key + ", Numero di telefono: " + value.toString());
		}

	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Telefono: " + getTelefono();
	}
}
