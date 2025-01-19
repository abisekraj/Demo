package com.spring.LoginExample;

@RestController
public class Controller {
	
@RequestMapping(Method=RequestMethod.Get ,value="/login")
Public Login getLogin(@PathVariable("abc")String uname,("ind")String Pwd)
{
	return LoginService();
}	
}

https://localhost:8080/login
	
{uname:abc,pwd:ind}