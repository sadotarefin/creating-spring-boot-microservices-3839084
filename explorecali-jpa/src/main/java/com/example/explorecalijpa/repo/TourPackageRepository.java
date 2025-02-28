package com.example.explorecalijpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.example.explorecalijpa.model.TourPackage;

public interface TourPackageRepository extends JpaRepository<TourPackage, String> {

}
