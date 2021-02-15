package webServer;

import java.util.Map;

import javax.servlet.http.HttpSession;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.UserDao;
import webServerDto.UserVo;

@Component("/webServer/login.do")
public class Login implements Controller, DataBinding {

	private UserDao userDao;
	
	public Login setUserDao(UserDao userDao) {
		this.userDao = userDao;
		return this;
	}
	
	
	@Override
	public Object[] getDataBinders() {

		return new Object[] {"login", UserVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("Login 들어옴");
		Boolean result = true;
		
		UserVo userVo = (UserVo)model.get("login");
		UserVo user = userDao.exist(userVo.getId(), userVo.getPw());
	
		
		if(user != null) {
			HttpSession session = (HttpSession)model.get("session");
			
			session.setAttribute("user", user);
			
			model.put("login_result", result);
			
		} else {
			model.put("login_result", "정보 없음");
		}
		
		return "/webServer/loginResult.jsp";
	}

}
