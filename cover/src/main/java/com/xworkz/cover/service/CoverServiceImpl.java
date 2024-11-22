package com.xworkz.cover.service;




import com.xworkz.cover.dto.CoverDTO;
import com.xworkz.cover.repository.CoverRepoImpl;

public class CoverServiceImpl implements CoverService {

	@Override
	public boolean validate(CoverDTO coverDTO) {
		CoverRepoImpl cr=new CoverRepoImpl();
		boolean saved=cr.save(coverDTO);
		return saved;
	}


	@Override
	public String getListById(int id) {
		CoverRepoImpl repo = new CoverRepoImpl();
		return repo.getListById(id);
	}

	@Override
	public String getEMailAndPassword(long phoneNumber) {
		CoverRepoImpl repo = new CoverRepoImpl();
		return repo.getEMailAndPassword(phoneNumber);
	}

	@Override
	public String checkEmailPassword(String email, String password) {
		String valid = null;

		CoverRepoImpl coverRepoImpl = new CoverRepoImpl();
		String res = coverRepoImpl.checkEmailPassword(email, password);

		return res;

	}

	@Override
	public String deleteByName(String name) {
		CoverRepoImpl coverRepoImpl = new CoverRepoImpl();
		String res = coverRepoImpl.deleteByName(name);
		return res;
	}

	@Override

	
	public String updateByEmail(String email) {
		CoverRepoImpl imp = new CoverRepoImpl();
		String value = imp.updateByEmail(email);
		return value;
	}

}
