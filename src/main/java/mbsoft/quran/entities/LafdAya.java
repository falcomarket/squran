package mbsoft.quran.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name="lafdwithaya")
public class LafdAya implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idlafd")
	private  int idlafd;

	@Column(name="nsa")
	@JsonProperty("nsa")
	private  int nsa;
	
	
	@Column(name="na")
	@JsonProperty("na")
	private int na;
		
	
	@Column(name="npa")
	@JsonProperty("npa")
	private int npa;

	@Column(name="nl")
	@JsonProperty("nl")
	private String nl;
	
	@Column(name="cas")
	@JsonProperty("cas")
	private String cas;

	@Column(name="can")
	@JsonProperty("can")
	private String can;

	@Column(name="cao")
	@JsonProperty("cao")
	private String cao;
}
