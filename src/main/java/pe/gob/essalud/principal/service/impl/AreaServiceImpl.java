package pe.gob.essalud.principal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.principal.model.Area;
import pe.gob.essalud.principal.repository.AreaRepository;
import pe.gob.essalud.principal.repository.IGenericRepo;
import pe.gob.essalud.principal.service.IAreaService;
@Service
public class AreaServiceImpl extends CRUDImpl<Area, String> implements IAreaService {

	@Autowired
	private AreaRepository repo;
	
	@Override
	protected IGenericRepo<Area, String> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

	

}
