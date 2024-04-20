package org.dnyanyog.services;

import java.util.List;
import java.util.Optional;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.DiscountRequest;
import org.dnyanyog.dto.DiscountResponse;
import org.dnyanyog.dto.User;
import org.dnyanyog.entity.Users;

public interface UserManagementService {
	Optional<AddUserResponse>  addUpdateUser(AddUserRequest request) throws Exception;
	AddUserResponse  UpdateUser(Long user_id, AddUserRequest request);
	 User getSingleUser(Long userId);
	 void deletetSingleUser(Long user_id);
	 List<Users>getAllUser();
	 List<Long>getAllUserIds();
	Optional<DiscountResponse> addDiscount(DiscountRequest request);
}
