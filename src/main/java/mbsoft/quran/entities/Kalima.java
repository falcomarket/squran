package mbsoft.quran.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name="kalima")
public class Kalima {
	
	@Id
	@Column(name="num")
	@JsonProperty("num")
	private  int num;
	
	@Column(name="nsa")
	@JsonProperty("nsa")
	private  int nsa;
	
	@Column(name="nl")
	@JsonProperty("nl")
	private  String nl;
	
	@Column(name="nombre")
	@JsonProperty("nombre")
	private  int nombre;
	
	@Column(name="groupe")
	@JsonProperty("groupe")
	private  int groupe;
	
	@Column(name="sgroupe")
	@JsonProperty("sgroupe")
	private  int sgroupe;
	
	
}
