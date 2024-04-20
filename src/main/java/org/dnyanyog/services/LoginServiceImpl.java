package org.dnyanyog.services;

import java.util.List;


import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.encrypt.EncryptionUtils;
import org.dnyanyog.enumm.ResponseCode;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dnyanyog.entity.Discount;
import org.dnyanyog.entity.Users;

@Service
public class LoginServiceImpl implements  LoginService{
	@Autowired
	UsersRepository userRepo;
	

@Autowired
EncryptionUtils encrypt;


	
	public LoginResponse validateUser(LoginRequest loginRequest) throws Exception {
		LoginResponse response =new LoginResponse();
		List<Users>liUser =userRepo.findByUsername(loginRequest.getUsername());
		if(liUser.size()==1) {
			Users userData = liUser.get(0);
			String encryptedPassword =userData.getPassword();
			String getencryptedPassword = encrypt.encrypt(loginRequest.getPassword());
			if( getencryptedPassword.equalsIgnoreCase(encryptedPassword)) {
				response.setStatus(ResponseCode .LOGIN_SUCCESS.getStatus());
				response.setMessage(ResponseCode .LOGIN_SUCCESS.getMessage());
			}
		}else {
			response.setStatus(ResponseCode .LOGIN_FAIL.getStatus());
			response.setMessage(ResponseCode .LOGIN_FAIL.getMessage());
			
		}
		return response;
		
	}
}

