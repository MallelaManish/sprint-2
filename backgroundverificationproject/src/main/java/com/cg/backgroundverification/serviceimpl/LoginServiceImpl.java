package com.cg.backgroundverification.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.backgroundverification.dao.LoginDao;
import com.cg.backgroundverification.dto.LoginDto;
import com.cg.backgroundverification.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
    
	@Autowired
	LoginDao ldao;
	public void setLoginDao(LoginDao ldao)
	{
		this.ldao=ldao;
	}
	
	
	@Override
	@Transactional(readOnly=true)
	public List<LoginDto> getLogin() {
		
		return ldao.findAll();
	}
	

}
 /*
@Autowired
LoginDao ldao;
public void setBdao(LoginDao ldao) { this.ldao=ldao;}

@Override
@Transactional(readOnly=true)
public List<LoginDto> getLogin()
{
return ldao.findAll();
}
*/