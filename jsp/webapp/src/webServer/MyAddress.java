package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.AddressDao;

@Component("/webServer/myAddress.do")
public class MyAddress implements Controller, DataBinding {
	
	private AddressDao addressDao;
	public MyAddress setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"no", Integer.class};
	}
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		int no = (Integer)model.get("no");

		model.put("myAddress", addressDao.selectOne(no));
		
		return "/webServer/myAddressResult.jsp";
	}

}
