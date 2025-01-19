package com.spring.LoginExample;

@RestController
public class Controller2 {
	
@RequestMapping(Method=RequestMethod.Get ,value="/login")
Public Login getLogin(@PathVariable("abc")String uname,("ind")String Pwd)
{
	return LoginService();
}	
}

https://localhost:8080/login
	
{uname:abc,pwd:ind}