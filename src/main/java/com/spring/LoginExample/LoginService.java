package com.spring.LoginExample;

import java.util.ArrayList;

@Service
public class LoginService {

Public List<Login> getAllcred()
{
List<Login> login=new ArrayList<Login>();
LoginRepository.findAll().forEach(login1->login.add(login));
}
}
