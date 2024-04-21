package org.dnyanyog.services;







import java.util.List;

import java.util.Optional;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.DiscountRequest;
import org.dnyanyog.dto.DiscountResponse;
import org.dnyanyog.dto.User;
import org.dnyanyog.encrypt.EncryptionUtils;
import org.dnyanyog.entity.Discount;
import org.dnyanyog.entity.Userss;
import org.dnyanyog.enumm.ResponseCode;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManagementServiceImpl implements UserManagementService{

@Autowired
UsersRepository userRepo;

@Autowired
AddUserResponse userresponse;

@Autowired
AddUserResponse userIds;

@Autowired
EncryptionUtils encrypt;



public Optional<AddUserResponse>  addUpdateUser(AddUserRequest request) throws Exception {
	
	  
	Userss UsersTable= Userss.getInstance()
		.setAge(request.getAge())
	    .setEmail(request.getEmail())
	     .setPassword(encrypt.encrypt(request.getPassword()))
	      .setUsername(request.getUsername());
	
	UsersTable =userRepo.save(UsersTable);
	
	userresponse.getInstance()
	.setUser_id(UsersTable.getUser_id())
	.setAge(UsersTable.getAge())
	.setEmail(UsersTable.getEmail())
	.setPassword(UsersTable.getPassword())
	.setUsername(UsersTable.getUsername())
	.setStatus(ResponseCode.USER_FOUND.getStatus())
	.setMessage(ResponseCode.USER_FOUND.getMessage());
	
		
	return Optional.of(userresponse);
	
	
	
}
public AddUserResponse  UpdateUser(Long user_id, AddUserRequest request){
	
	  
	Optional<Userss>receivedData=userRepo.findById(user_id);
	if(receivedData.isPresent()) {
			Userss UsersTable=Userss.getInstance()
				 .setAge(request.getAge())
				 .setEmail(request.getEmail())
			     .setPassword(request.getPassword())
				 .setUsername(request.getUsername())
			      .setUser_id(user_id);
	UsersTable =userRepo.save(UsersTable);
	
	userresponse.setMessage(ResponseCode.USER_UPDATE.getMessage());
	userresponse.setStatus(ResponseCode.USER_UPDATE.getStatus());
	userresponse.setUser_id(UsersTable.getUser_id());
	userresponse.setAge(UsersTable.getAge());
	userresponse.setEmail(UsersTable.getEmail());
	userresponse.setPassword(UsersTable.getPassword());
	userresponse.setUsername(UsersTable.getUsername());
			}
	return userresponse;
	
	
	
	
	
}



public User getSingleUser(Long userId) {
	User userResponse =new User();
	
	Optional<Userss>receivedData=userRepo.findById(userId);
	if(receivedData.isEmpty()) {
		userResponse.setStatus(ResponseCode.USER_NOT_FOUND.getStatus());
		userResponse.setMessage(ResponseCode.USER_NOT_FOUND.getMessage());
			}else {
				Userss user=receivedData.get();
				userResponse.setStatus(ResponseCode.USER_FOUND.getStatus());
				userResponse.setMessage(ResponseCode.USER_FOUND.getMessage());
				userResponse.setUser_id(user.getUser_id());
				userResponse.setAge(user.getAge());
				userResponse.setEmail(user.getEmail());
				userResponse.setPassword(user.getPassword());
				userResponse.setUsername(user.getUsername());
				//return userResponse;
			}
	return userResponse;
}



public void deletetSingleUser(Long user_id) {
	User userResponse =new User();
	
	Optional<Userss>receivedData=userRepo.findById(user_id);
	if(receivedData.isPresent()) {
		userRepo.deleteById(user_id);
		userResponse.setUser_id(user_id);		
				userResponse.setStatus(ResponseCode.USER_DELETE.getStatus());
				userResponse.setMessage(ResponseCode.USER_DELETE.getMessage());
		
				//return userResponse;
			}
	
	
}
public List<Userss>getAllUser(){
	return userRepo.findAll();
}


@Override
public Optional<DiscountResponse>addDiscount(DiscountRequest request){
	try {
	DiscountResponse response=new DiscountResponse();
	
	double discount= calculateDiscount(request.getAge());
	
	if("female".equalsIgnoreCase(request.getGender())){
		discount +=5;
	}

    saveDiscount(request.getAge(),request.getGender(),discount);
    response.setDiscountpercentage(discount);
    return Optional.of(response);
}
	catch (Exception e) {
        return Optional.empty();
    }
}
private void saveDiscount(int age ,String gender ,double discount) {
	Discount discounts=new Discount();
	 discounts.setAge(age);
	 discounts.setGender(gender);
	 discounts.setDiscountpercentage(discount);
	 
	 userRepo.save( discounts);
}
private double calculateDiscount(int age) {
	if(age<30) {
	return 10;
	}
	
	else if(age>= 30 && age< 60) {
		return 5;
	}
	else {
		return 15;
	}
	
}
@Override
public List<Long> getAllUserIds() {
	// TODO Auto-generated method stub
	return null;
}

}