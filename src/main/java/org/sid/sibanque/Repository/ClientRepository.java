package org.sid.sibanque.Repository;

import org.sid.sibanque.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String>{
 
	public Client findById(Long id);

	public boolean existsById(Long id);

	public void deleteById(Long id);
}
