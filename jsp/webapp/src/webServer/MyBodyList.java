package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.BodyProfileDao;
import webServerDto.BodyProfileVo;
import webServerDto.UserVo;

@Component("/webServer/mybodyList.do")
public class MyBodyList implements Controller, DataBinding {

	private BodyProfileDao bodyDao;
	public MyBodyList setBodyProfileDao(BodyProfileDao bodyDao) {
		this.bodyDao = bodyDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {

		return new Object[] {"userVo", UserVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("bodyList 들어옴");
		UserVo userVo = (UserVo)model.get("userVo");
//		BodyProfileVo bodyVo = (BodyProfileVo)model.get("bodyVo");
		BodyProfileVo body = bodyDao.profileList(userVo.getId());
		
		
		if(body != null) {

			model.put("myBody", body);
		}
		
		return "/webServer/myBodyListResult.jsp";
	}

}
