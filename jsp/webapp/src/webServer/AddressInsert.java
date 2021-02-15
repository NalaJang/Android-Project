package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.AddressDao;
import webServerDto.AddressVo;

@Component("/webServer/insertAddress.do")
public class AddressInsert implements Controller, DataBinding {
	
	private AddressDao addressDao;
	public AddressInsert setAddressDao (AddressDao addressDao) {
		this.addressDao = addressDao;
		return this;
	}

	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"address", AddressVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("addressInsert 들어옴");

		AddressVo address = (AddressVo)model.get("address");
		
		model.put("insertAddress", addressDao.insert(address));
		
		return "/webServer/insertAddressResult.jsp";
	}

}
