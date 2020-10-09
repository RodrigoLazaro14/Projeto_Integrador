package com.groupg4.global.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupg4.global.model.HospitalModel;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalModel, Long> {
	
	public List<HospitalModel> findAllBynomeHospitalContainingIgnoreCase( String nome);

}