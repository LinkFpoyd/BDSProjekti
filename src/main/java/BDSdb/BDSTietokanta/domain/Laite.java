package BDSdb.BDSTietokanta.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long laiteid;
	
	private String nimi;
	
	@ManyToOne
	@JoinColumn(name="tyyppiId")
	private Tyyppi tyyppi;
	
	private Date tuonti;
	private Date vienti;
	
	@ManyToOne
	@JoinColumn(name="merkkiId")
	private Merkki merkki;

	public Laite(long laiteid, String nimi, Tyyppi tyyppi, Date tuonti, Date vienti, Merkki merkki) {
		super();
		this.laiteid = laiteid;
		this.nimi = nimi;
		this.tyyppi = tyyppi;
		this.tuonti = tuonti;
		this.vienti = vienti;
		this.merkki = merkki;
	}

	public long getLaiteid() {
		return laiteid;
	}

	public void setLaiteid(long laiteid) {
		this.laiteid = laiteid;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public Tyyppi getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(Tyyppi tyyppi) {
		this.tyyppi = tyyppi;
	}

	public Date getTuonti() {
		return tuonti;
	}

	public void setTuonti(Date tuonti) {
		this.tuonti = tuonti;
	}

	public Date getVienti() {
		return vienti;
	}

	public void setVienti(Date vienti) {
		this.vienti = vienti;
	}

	public Merkki getMerkki() {
		return merkki;
	}

	public void setMerkki(Merkki merkki) {
		this.merkki = merkki;
	}

	@Override
	public String toString() {
		return "Laite [laiteid=" + laiteid + ", nimi=" + nimi + ", tyyppi=" + tyyppi + ", tuonti=" + tuonti
				+ ", vienti=" + vienti + ", merkki=" + merkki + "]";
	}
	
	
	
	
	

}
