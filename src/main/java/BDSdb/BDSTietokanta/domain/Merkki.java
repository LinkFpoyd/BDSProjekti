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
public class Merkki {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long merkkiId;
	private String name;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="merkki")
	private List<Merkki> merkit;
	
	public Merkki() {}

	public Merkki(String name) {
		super();
		this.name = name;
	}

	public long getMerkkiId() {
		return merkkiId;
	}

	public void setMerkkiId(long merkkiId) {
		this.merkkiId = merkkiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Merkki> getMerkit() {
		return merkit;
	}

	public void setMerkit(List<Merkki> merkit) {
		this.merkit = merkit;
	}

	@Override
	public String toString() {
		return "Merkki [merkkiId=" + merkkiId + ", name=" + name + "]";
	}
	

	
}
