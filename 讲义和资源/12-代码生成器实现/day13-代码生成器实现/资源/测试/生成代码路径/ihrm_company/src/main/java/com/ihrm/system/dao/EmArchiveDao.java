package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmArchive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmArchiveDao extends JpaRepository<EmArchive,String> ,JpaSpecificationExecutor<EmArchive> {
}
