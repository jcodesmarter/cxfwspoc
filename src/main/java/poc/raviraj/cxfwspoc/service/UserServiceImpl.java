package poc.raviraj.cxfwspoc.service;

import java.util.List;


import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poc.raviraj.cxfwspoc.dao.UserDAO;
import poc.raviraj.cxfwspoc.model.User;

@Service(value="userService")
@WebService(name = "userService", endpointInterface = "poc.raviraj.cxfwspoc.service.UserService", serviceName="users", wsdlLocation = "wsdl/users.wsdl")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public User delete(User user) {
		return userDao.delete(user);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User find(Long userId) {
		return userDao.find(userId);
	}

	public List<User> paginated(int pageNumber, int perPageLimit) {
		return userDao.paginated(pageNumber, perPageLimit);
	}
	
	public List<User> findAllByFirstNameOrLastNameOrUsername(String searchText){
		if(searchText.length() == 0){
			return userDao.findAll();
		}
		searchText = searchText + "%";
		return userDao.findAllByFirstNameOrLastNameOrUsername(searchText);
	}

}
