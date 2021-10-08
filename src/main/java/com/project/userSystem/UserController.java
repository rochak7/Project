package com.project.userSystem;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.userSystem.Valid;
import com.project.userSystem.UserList;
import com.project.userSystem.UserRepository;
import com.project.userSystem.advice.ResourceNotFoundException;


@RestController
public class UserController {
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/userlist/{userId}")
	 public ResponseEntity<UserList> getUserById(@PathVariable(value = "userId") int userId) throws ResourceNotFoundException{
		
		UserList user = repo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found for this Id :: " + userId));
		return ResponseEntity.ok().body(user);
	}
	
	 @GetMapping("userlist")
	    public ResponseEntity<List<UserList>> getAll() {
	        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
	 }
	    
	
	@PostMapping("/userlist")
	public UserList createUser(@Valid @RequestBody UserList user) {
        return repo.save(user);
    }
	
	@DeleteMapping("/userlist/{userId}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "userId") int userId) throws ResourceNotFoundException {
		UserList user = repo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found for this Id :: " + userId));
		
		repo.delete(user);
	    Map<String, Boolean> response = new HashMap<>();
	    response.put("deleted", Boolean.TRUE);
	    return response;
		
	}
	
	@PutMapping("/userlist/{userId}")
	public ResponseEntity<UserList> updateUser(@PathVariable(value = "userId") int userId,
	         @Valid @RequestBody UserList userDetails) throws ResourceNotFoundException {
	         UserList user = repo.findById(userId)
	        .orElseThrow(() -> new ResourceNotFoundException("User not found for this Id :: " + userId));
	         user.setFname(userDetails.getFname());
	         user.setLname(userDetails.getLname());
	         user.setDob(userDetails.getDob());
	         user.setCity(userDetails.getCity());
	         user.setMobile(userDetails.getMobile());
	         final UserList updatedUser = repo.save(user);
	         return ResponseEntity.ok(updatedUser); 
	}

}
