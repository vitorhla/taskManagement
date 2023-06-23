package com.taskManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManagement.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

	/*
	
	@Modifying
	@Query(nativeQuery = true, value = "INSERT INTO AD_PLUBARECEBER (CODID, DISTRIBUIDOR,VENDEDOR,RAZAO_SOCIAL,CNPJ,CANAL,TITULO,EMISSAO,VENCIMENTO,VALOR_ORIGINAL,VALOR_PAGO,VALOR_SALDO) "
			+ "VALUES (:codid,:distribuidor,:vendedor,:razao_social,:cnpj,:canal,:titulo,:emissao,:vencimento,:valor_original,:valor_pago,:valor_saldo)")
	Integer insertAccountReceives(@Param("codid") Integer codid, @Param("distribuidor") String distribuidor,
			@Param("vendedor") String vendedor, @Param("razao_social") String razao_social, @Param("cnpj") String cnpj,
			@Param("canal") String canal, @Param("titulo") String titulo, @Param("emissao") String emissao,
			@Param("vencimento") String vencimento, @Param("valor_original") double valor_original,
			@Param("valor_pago") double valor_pago, @Param("valor_saldo") double valor_saldo);

}


*/
}
