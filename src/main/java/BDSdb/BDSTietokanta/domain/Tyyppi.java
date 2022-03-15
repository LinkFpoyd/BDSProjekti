package BDSdb.BDSTietokanta.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tyyppi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long laiteid;
	private String nimi;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="tyyppi")
	private List<Laite> laitteet;
	
	public Tyyppi() {}
	

	public Tyyppi(String nimi) {
		super();
		this.nimi = nimi;
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

	public List<Laite> getLaitteet() {
		return laitteet;
	}

	public void setLaitteet(List<Laite> laitteet) {
		this.laitteet = laitteet;
	}

	@Override
	public String toString() {
		return "Tyyppi [laiteid=" + laiteid + ", nimi=" + nimi + "]";
	}
	
	
	
	
}
