package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.AddressDao;

@Component("/webServer/addressDelete.do")
public class AddressDelete implements Controller, DataBinding {

	private AddressDao addressDao;
	public AddressDelete setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"num", Integer.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		int num = (Integer)model.get("num");
		
		if(num > 0) {
			
			addressDao.delete(num);
			
		}
		
		return "redirect:../webServer/addressList.do";
	}

}
