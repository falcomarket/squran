package mbsoft.quran.entities;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;


@Data 
public class AyahEntryPK implements Serializable{
	
		private static final long serialVersionUID = 1L;
		private  int Nsa;
		private int Na;
		@Override
		public int hashCode() {
			return Objects.hash(Na, Nsa);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AyahEntryPK other = (AyahEntryPK) obj;
			return Na == other.Na && Nsa == other.Nsa;
		}
	
}