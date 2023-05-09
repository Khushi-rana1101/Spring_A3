package com.deloitte.SpringMicroservices.AccountService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/account")
public class AccountServiceController {
			
	
			@Operation(summary = "It's the Get API to check health of Account Management service")

			@RequestMapping(method = RequestMethod.GET, value="/")
			public String healthcheck() {
				return "Account Service is Up and Running";
				}
			
			@Operation(summary = "It's the POST API to create Account")
			@RequestMapping(method = RequestMethod.POST, value="/createaccount")
			public String createAccount() {
				Account account= new Account();
				account.setId(1);
				account.setName("Khushi");
				long id = account.getId();
				String name=account.getName();
				return "Account created for Id " +id+ "  "+ name;
				}
			
			@Operation(summary = "It's the PUT API to update Account")
			@RequestMapping(method = RequestMethod.PUT, value="/updateaccount/{accountId}")
			public String updateAccount(@PathVariable(name = "accountId") long accountId1) {
				Account account= new Account();
				
				 account.setName("Ram");
				 String name=account.getName();
						
				return "Account Updated for " + accountId1 +" now name is " + name;
				}
			
			
			@Operation(summary = "It's the Delete API to delete Account")
			@RequestMapping(method = RequestMethod.DELETE, value="/deleteaccount")
			public String deleteAccount() {
				return "Account Service is Up and Running";
				}
			
			
			
				
			@Operation(summary = "It's the Get API to get an Account by its id")
			@RequestMapping(method = RequestMethod.GET, value="/accountId/{accountId}")
			
			public String getAccountId(@PathVariable(name = "accountId") long accountId1) {
				
				return "Account Id is " +accountId1;
				}
			

			@RequestMapping(method = RequestMethod.GET, value="/accountDetails")
			public String getAccountDetails(@RequestParam(name = "accountId") long accountId1, @RequestParam(name="accountName") String name ) {
				
				return "Account Id is " +accountId1 + "    " + "Name is " + name;
				}
			
			
			
}


