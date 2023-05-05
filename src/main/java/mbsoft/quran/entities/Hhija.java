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
@Table(name="hhija")
public class Hhija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idharf")
	@JsonProperty("idharf")
	private  int idharf;
	
	
	@Column(name="idabjd")
	@JsonProperty("idabjd")
	private  int idabjd;
	
	@Column(name="nharf")
	@JsonProperty("nharf")
	private  String nharf;
		
	
	@Column(name="harf")
	@JsonProperty("harf")
	private String harf;
		
	@Column(name="type")
	@JsonProperty("type")
	private String type;

}
