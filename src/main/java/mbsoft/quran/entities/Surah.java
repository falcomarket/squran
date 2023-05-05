package mbsoft.quran.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Surah implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idsura")
	private  int idsura;
	
	
	@Column(name="os")
	@JsonProperty("os")
	private  int os;
		
	
	
	@Column(name="ns")
	@JsonProperty("ns")
	private  String ns;
	
	@Column(name="css")
	@JsonProperty("css")
	private  String css;

	@Column(name="csn")
	@JsonProperty("csn")
	private  String csn;
	
	@Column(name="cso")
	@JsonProperty("cso")
	private  String cso;
	
	
	@Column(name="ans")
	@JsonProperty("ans")
	private  int ans;
	
	@Column(name="nas")
	@JsonProperty("nas")
	private  String nas;
	
	@Column(name="ots")
	@JsonProperty("ota")
	private  int ots;
	
	@Column(name="mms")
	@JsonProperty("mms")
	private  String mms;

	

	
}
