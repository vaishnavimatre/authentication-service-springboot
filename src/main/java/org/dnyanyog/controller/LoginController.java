package org.dnyanyog.controller;

import org.dnyanyog.dto.LoginRequest;

import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.services.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
public class LoginController {
	@Autowired
	LoginServiceImpl loginService;
@PostMapping(path="/auth/validate")
public LoginResponse validate(@Valid @RequestBody LoginRequest loginRequest) throws Exception
{
return loginService.validateUser(loginRequest);
}
}