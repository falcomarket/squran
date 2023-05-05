package mbsoft.quran.entities;

import java.io.Serializable;

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
@Table(name="ayah")
public class Ayah implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idaya")
	@JsonProperty("idaya")
	private  int idaya;
	
	@Column(name="nsa")
	@JsonProperty("nsa")
	private  int nsa;
		
	
	@Column(name="na")
	@JsonProperty("na")
	private int na;
		
	@Column(name="cas")
	@JsonProperty("cas")
	private String cas;

	@Column(name="can")
	@JsonProperty("can")
	private String can;

	@Column(name="cao")
	@JsonProperty("cao")
	private String cao;
		
	@Column(name="nqa")
	@JsonProperty("nqa")
	private int nqa;

	@Column(name="etat")
	@JsonProperty("etat")
	private char etat;
	
	

	
}
