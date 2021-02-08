package webServer;

import java.util.ArrayList;
import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.SelectedWorkerDao;
import webServerDto.SelectedWorkerVo;
import webServerDto.UserVo;

@Component("/webServer/selectedWorkerList.do")
public class SelectedWorkerList implements Controller, DataBinding {

	private SelectedWorkerDao selectedWorkerDao;
	public SelectedWorkerList setSelectedWorkerDao(SelectedWorkerDao selectedWorkerDao) {
		this.selectedWorkerDao = selectedWorkerDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"userVo", UserVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("selectedWorker 들어옴");
		
		UserVo user = (UserVo)model.get("userVo");
		
		ArrayList<SelectedWorkerVo> workerList = selectedWorkerDao.selectedWorkerList(user.getId());

		model.put("selectedWorkerList", workerList);
		
		return "/webServer/selectedWorkerListResult.jsp";
	}

}
