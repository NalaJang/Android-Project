package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.UserDao;

@Component("/webServer/findId.do")
public class FindId implements Controller, DataBinding{
	
	private UserDao userDao;
	public FindId setUserDao(UserDao userDao) {
		this.userDao = userDao;
		return this;
	}

	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"name", String.class, "phone", String.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("findId 들어옴");
		
		String name = (String)model.get("name");
		String phone = (String)model.get("phone");
		
		
		if(userDao.findId(name, phone) != null) {
			
			model.put("findId", userDao.findId(name, phone));
			
		}		
		
		return "/webServer/findId.jsp";
	}

}
