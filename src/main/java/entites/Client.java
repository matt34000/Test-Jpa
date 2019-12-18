package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	private Integer id;

	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;


	@Override
	public String toString(){ 
		return "Client : id: " + id + " nom: " + nom + " prenom: " + prenom;
	}

	
	
	/**
	 * @param id
	 * @param titre
	 * @param auteur
	 */
	public Client() {
		super();
	}	
	
	
	
	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}



	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}



	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}






	


}

