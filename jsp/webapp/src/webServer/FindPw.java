package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.UserDao;

@Component("/webServer/findPw.do")
public class FindPw implements Controller, DataBinding{
	
	private UserDao userDao;
	public FindPw setUserDao(UserDao userDao) {
		this.userDao = userDao;
		return this;
	}

	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"id", String.class, "phone", String.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("findPw 들어옴");
		
		String id = (String)model.get("id");
		String phone = (String)model.get("phone");
		
		
		if(userDao.findPw(id, phone) != null) {
			
			model.put("findPw", userDao.findPw(id, phone));
			
		}		
		
		return "/webServer/findPw.jsp";
	}

}
