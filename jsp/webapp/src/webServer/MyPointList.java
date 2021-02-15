package webServer;

import java.util.ArrayList;
import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.PointDao;
import webServerDto.PointVo;
import webServerDto.UserVo;

@Component("/webServer/pointList.do")
public class MyPointList implements Controller, DataBinding{
	
	private PointDao pointDao;
	public MyPointList setPointDao(PointDao pointDao) {
		this.pointDao = pointDao;
		return this;
	}

	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"userVo", UserVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("pointList 들어옴");

		UserVo userVo = (UserVo)model.get("userVo");
		
		if(userVo.getId() == null) {
//			return "/webServer/pointListResult.jsp";
			
		} else {
			
			
			ArrayList<PointVo> pointList = pointDao.pointList(userVo.getId());
			
			model.put("pointList", pointList);
			
//			return "/webServer/pointListResult.jsp";
		}
		return "/webServer/pointListResult.jsp";
	}

}
