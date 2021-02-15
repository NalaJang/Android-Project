package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.SelectedWorkerDao;

@Component("/webServer/workerDelete.do")
public class WorkerDelete implements Controller, DataBinding{

	private SelectedWorkerDao selectedWorkerDao;
	public WorkerDelete setSelectedWorkerDao(SelectedWorkerDao selectedWorkerDao) {
		this.selectedWorkerDao = selectedWorkerDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"num", Integer.class};
	}
	
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("workerDelete 들어옴");

		int num = (Integer)model.get("num");
		
		
		
		if(selectedWorkerDao.workerDelete(num) > 0) {
			System.out.println("삭제 성공");
			
			
		} else {
			System.out.println("실패");
		}
		
	
		return "redirect:../webServer/selectedWorkerList.do";
	}

}
