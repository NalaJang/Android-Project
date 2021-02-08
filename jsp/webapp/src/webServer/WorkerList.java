package webServer;

import java.util.ArrayList;
import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import webServerDao.WorkerDao;
import webServerDto.WorkerVo;

@Component("/webServer/workerList.do")
public class WorkerList implements Controller {

	private WorkerDao workerDao;
	public WorkerList setWorkerDao(WorkerDao workerDao) {
		this.workerDao = workerDao;
		return this;
	}
	
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {

		System.out.println("workerList 들어옴");
		
		ArrayList<WorkerVo> workerList = workerDao.workerList();
		model.put("workerList", workerList);
		
		
		return "/webServer/workerListResult.jsp";
	}

}
