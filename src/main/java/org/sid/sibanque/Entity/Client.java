package org.sid.sibanque.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code_CLI")
	private Long codeCli;
	
	@Column(name = "nom_CLI", length = 25)
	private String nomCli; 
	
	@Column(name = "prenom_CLI", length = 35)
	private String prenomCli;
	
	@Column(name = "email_CLI",unique = true)
	private String emailCli;
	
	@Column(name = "telephone_CLI",length = 8)
	private String telephoneCli;
	

}
