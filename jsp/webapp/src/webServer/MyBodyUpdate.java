package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.BodyProfileDao;
import webServerDto.BodyProfileVo;

@Component("/webServer/myBodyUpdate.do")
public class MyBodyUpdate implements Controller, DataBinding {

	private BodyProfileDao bodyDao;
	public MyBodyUpdate setBodyProfileDao(BodyProfileDao bodyDao) {
		this.bodyDao = bodyDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"bodyVo", BodyProfileVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("myBodyUpdate 들어옴");
		
		BodyProfileVo bodyVo = (BodyProfileVo)model.get("bodyVo");
		

		if(bodyVo.getId() != null) {
			
			bodyDao.update(bodyVo);
			
//			BodyProfileVo bodyInfo = bodyDao.selectOne(bodyVo.getId());
			model.put("bodyInfo", bodyVo);
			
			
		} 
//		else {
//			bodyDao.update(bodyVo);
//		}
		
		return "/webServer/myBodyUpdateResult.jsp";
	}
}
