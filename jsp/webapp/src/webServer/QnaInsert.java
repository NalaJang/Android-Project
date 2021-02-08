package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.QnADao;
import webServerDto.QnaVo;
import webServerDto.UserVo;

@Component("/webServer/qnaInsert.do")
public class QnaInsert implements Controller, DataBinding {

	private QnADao qnaDao;
	public QnaInsert setQnaDao(QnADao qnaDao) {
		this.qnaDao = qnaDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"userVo", UserVo.class, "qnaVo", QnaVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("qnaInsert 들어옴");
		
		UserVo userVo = (UserVo)model.get("userVo");
		
		Boolean result = true;
		
		if(userVo == null) {
			
			result = false;
			
			model.put("insertQna", "문의실패");
//			return "/webServer/qnaInserResult.jsp";
			
		} else {
			result = true;
			
			QnaVo qnaVo = (QnaVo)model.get("qnaVo");
			qnaDao.insertqna(qnaVo, userVo.getId());
			
			model.put("insertQna", result);
//			return "/webServer/qnaInserResult.jsp";
			
		}
		return "/webServer/qnaInserResult.jsp";
	}
}
