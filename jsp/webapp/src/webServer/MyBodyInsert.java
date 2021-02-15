package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.BodyProfileDao;
import webServerDto.BodyProfileVo;

@Component("/webServer/mybodyInsert.do")
public class MyBodyInsert implements Controller, DataBinding {

	private BodyProfileDao bodyDao;
	public MyBodyInsert setBodyProfileDao(BodyProfileDao bodyDao) {
		this.bodyDao = bodyDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"bodyVo", BodyProfileVo.class};
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("MyBodyInsert 들어옴");
		
		BodyProfileVo bodyVo = (BodyProfileVo)model.get("bodyVo");
		
		int result = bodyDao.insert(bodyVo);
			
		if(result > 0) {
			model.put("insertBody", result);	//성공
			
		} else {
			model.put("insertBody", "실패");
		}
			

		return "/webServer/insertBodyResult.jsp";
	}
	
}
