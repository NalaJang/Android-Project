package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.QnADao;
import webServerDto.UserVo;

@Component("/webServer/qnaContent.do")
public class QnaContent implements Controller, DataBinding {

	private QnADao qnaDao;
	public QnaContent setQnaDao(QnADao qnaDao) {
		this.qnaDao = qnaDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"num", Integer.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("qnaContent 들어옴");
		int num = (Integer)model.get("num");
		
		UserVo userVo = (UserVo)model.get("userVo");
		
		System.out.println("num : " + num);
		
		model.put("contentList", qnaDao.getContent(num));
		
		return "/webServer/qnaContentResult.jsp";
	}

}
