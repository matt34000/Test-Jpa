package entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
	@Id
	private Integer id;

	@Column(name = "DATE_DEBUT", nullable = false)
	private LocalDateTime dateDebut;
	
	@Column(name = "DELAI")
	private Integer delai;

	@Column(name = "DATE_FIN")
	private LocalDateTime dateFin;

	@Column(name = "CLIENT", nullable = false)
	private Client client;
	
	
	@Override
	public String toString(){ 
		return "Emprunt : id: " + id + " dateDebut: " + dateDebut + " delai: " + delai + " dateFin: " + dateFin + " client: " + client;
	}


	public Emprunt() {
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
	 * @return the dateDebut
	 */
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}


	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}


	/** Getter
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}


	/** Setter
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}


	/** Getter
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}


	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}


	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}


	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	
	




}


