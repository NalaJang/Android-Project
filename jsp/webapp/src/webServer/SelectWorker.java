package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.SelectedWorkerDao;

@Component("/webServer/selectWorker.do")
public class SelectWorker implements Controller, DataBinding {

	private SelectedWorkerDao selectedWorkerDao;
	public SelectWorker setSelectedWorkerDao(SelectedWorkerDao selectedWorkerDao) {
		this.selectedWorkerDao = selectedWorkerDao;
		return this;
	}
	
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"id", String.class, "workerNum", Integer.class, "workerId", String.class};
	}

	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("SelectWorker 들어옴");

//		for(Map.Entry<String, Object>entry : model.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue().toString());
//		}
		
//		UserVo userVo = (UserVo)model.get("userVo");
//		WorkerVo workerVo = (WorkerVo)model.get("workerVo");
		String id = (String)model.get("id");
		int workerNum = (Integer)model.get("workerNum");
		String workerId = (String)model.get("workerId");
		
		System.out.println("id : " + id + "num : " + workerNum);
		
		int result = selectedWorkerDao.selectWorker(id, workerNum, workerId);
		

		if(result > 0 ) {
			
			model.put("select", result);
			
		} else {
			model.put("select", "등록실패");
		}
		
		return "/webServer/selectWorkerResult.jsp";
	}
	
	

}
