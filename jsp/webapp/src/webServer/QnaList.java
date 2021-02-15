package webServer;

import java.util.ArrayList;
import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.QnADao;
import webServerDto.QnaVo;
import webServerDto.UserVo;

@Component("/webServer/qnaList.do")
public class QnaList implements Controller,DataBinding {

	private QnADao qnaDao;
	public QnaList setQnaDao(QnADao qnaDao) {
		this.qnaDao = qnaDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
	
		return new Object[] {"userVo", UserVo.class};
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("qnalist 들어옴");
		
//		QnaVo qnaVo = (QnaVo)model.get("qnaVo");

		
		UserVo userVo = (UserVo)model.get("userVo");
//		String id = (String)model.get("id");
		
		System.out.println("1 : " + userVo.getId());
		
//		ArrayList<QnaVo> qnaList = qnaDao.qnaList(id);
//		ArrayList<QnaVo> qnaList = qnaDao.qnaList((String)model.get("id"));
		
		if(userVo.getId() == null) {
			model.put("qnaList", "불러오기실패");
		} else {
			
			ArrayList<QnaVo> qnaList = qnaDao.qnaList(userVo.getId());
			model.put("qnaList", qnaList);
		}
		
		return "/webServer/qnaListResult.jsp";
	}

	

}
