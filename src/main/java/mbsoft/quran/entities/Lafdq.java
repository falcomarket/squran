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
@Table(name="qlafd")
public class Lafdq implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idlq")
	private  int idlq;

	@Column(name="nl")
	@JsonProperty("nl")
	private  String nl;
	
	
	@Column(name="nombre")
	@JsonProperty("nombre")
	private int nombre;
	
	@Column(name="harfd")
	@JsonProperty("harfd")
	private String harfd;
	
}
