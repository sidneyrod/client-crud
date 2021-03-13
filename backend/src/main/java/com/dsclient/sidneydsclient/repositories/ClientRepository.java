package com.dsclient.sidneydsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsclient.sidneydsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
