package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.UserDao;

@Component("/webServer/userCheck.do")
public class UserCheck implements Controller, DataBinding {

	private UserDao userDao;
	public UserCheck setUserDao(UserDao userDao) {
		this.userDao = userDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"id", String.class, "pw", String.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("UserCheck 들어옴");
		
		String id = (String)model.get("id");
		String pw = (String)model.get("pw");
		
		if(userDao.exist(id, pw) != null) {
			
			boolean result = true;
			model.put("result", result);
			
		} else {
			model.put("result", "연결 실패");
		}
		
		return "/webServer/userCheckResult.jsp";
	}

}
