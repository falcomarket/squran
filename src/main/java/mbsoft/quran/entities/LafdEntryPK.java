package mbsoft.quran.entities;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class LafdEntryPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private  int Nsa;
	
	private int Na;
	
	private int Npa;

	@Override
	public int hashCode() {
		return Objects.hash(Na, Npa, Nsa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LafdEntryPK other = (LafdEntryPK) obj;
		return Na == other.Na && Npa == other.Npa && Nsa == other.Nsa;
	}
	
}