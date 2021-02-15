package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.SelectedWorkerDao;
import webServerDto.SelectedWorkerVo;

@Component("/webServer/checkList.do")
public class CheckList implements Controller, DataBinding {

	private SelectedWorkerDao selectedWorkerDao;
	
	public CheckList setSelectedWorkerDao(SelectedWorkerDao selectedWorkerDao) {
		this.selectedWorkerDao = selectedWorkerDao;
		return this;
	}
	
	
	@Override
	public Object[] getDataBinders() {

		return new Object[] {"id", String.class, "workerId", String.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("checkList 들어옴");
		Boolean result = true;
		
//		SelectedWorkerVo selectVo = (SelectedWorkerVo)model.get("selectVo");
		SelectedWorkerVo select = selectedWorkerDao.exist((String)model.get("id"), (String)model.get("workerId"));
	

		System.out.println(select.toString());
		
		//이미 선택한 상담사
		if(select != null) {
//			HttpSession session = (HttpSession)model.get("session");
//			
//			session.setAttribute("user", select);
			
			model.put("select", select);
			model.put("checkList", result);
			
		} else {
			model.put("checkList", "정보 없음");
		}
		
		return "/webServer/checkListResult.jsp";
	}

}
