package poc.raviraj.cxfwspoc.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import poc.raviraj.cxfwspoc.model.User;

@WebService(name = "userService")
public interface UserService {

	@WebMethod
	public User save(User user);

	@WebMethod
	public User delete(User user);

	@WebMethod
	public List<User> findAll();

	@WebMethod
	public User find(Long userId);

	@WebMethod
	public List<User> paginated(int pageNumber, int perPageLimit);

	@WebMethod
	public List<User> findAllByFirstNameOrLastNameOrUsername(String searchText);

}
