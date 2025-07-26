package patientRecord.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Disease {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String D1Name;
	private String D2Name;

	public String getD1Name() {
		return D1Name;
	}

	public void setD1Name(String d1Name) {
		D1Name = d1Name;
	}

	public String getD2Name() {
		return D2Name;
	}

	public void setD2Name(String d2Name) {
		D2Name = d2Name;
	}

	@Override
	public String toString() {
		return "Disease [D1Name=" + D1Name + ", D2Name=" + D2Name + "]";
	}

}
