package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.UserDao;
import webServerDto.UserVo;

@Component("/webServer/userInfoUpdate.do")
public class UserInfoUpdate implements Controller, DataBinding {

	private UserDao userDao;
	public UserInfoUpdate setUserDao(UserDao userDao) {
		this.userDao = userDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"userVo", UserVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("userInfoUpdate 들어옴");
		
		UserVo userVo = (UserVo)model.get("userVo");
		

		System.out.println(userVo.getId());
		

		if(userVo.getId() != null) {	//-> 수정함
			userDao.update(userVo);
			
//			UserVo userInfo = userDao.selectOne(userVo.getId());
			
			model.put("userInfo", userVo);
			
			
		} 
//		else {
//			userDao.update(userVo);
//		}
		
		return "/webServer/userUpdateResult.jsp";
	}
}
