package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.BodyProfileDao;
import webServerDao.UserDao;
import webServerDto.BodyProfileVo;
import webServerDto.UserVo;

@Component("/webServer/signUp.do")
public class SignUp implements Controller, DataBinding {

	private UserDao userDao;
	public SignUp setUserDao(UserDao userDao) {
		this.userDao = userDao;
		return this;
	}
	
	private BodyProfileDao bodyDao;
	public SignUp setBodyProfileDao(BodyProfileDao bodyDao) {
		this.bodyDao = bodyDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"userVo", UserVo.class, "bodyVo", BodyProfileVo.class};
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {

		System.out.println("signUp 들어옴");
		
		UserVo userVo = (UserVo)model.get("userVo");
		BodyProfileVo bodyVo = (BodyProfileVo)model.get("bodyVo");
		
		int result = userDao.insert(userVo);
//		bodyDao.insert(bodyVo);
		
		
		if(result > 0) {
			model.put("sign_up_result", result);
			model.put("bodyInfo", bodyDao.insert(bodyVo));
			
		} else {
			model.put("sign_up_result", "실패");
			model.put("bodyInfo", "실패");
		}
		
		

		return "/webServer/signUpResult.jsp";
	}
	
	
}
