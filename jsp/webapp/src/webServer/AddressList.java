package webServer;

import java.util.ArrayList;
import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.AddressDao;
import webServerDto.AddressVo;

@Component("/webServer/addressList.do")
public class AddressList implements Controller, DataBinding {

	private AddressDao addressDao;
	public AddressList setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
		return this;
	}
	
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"addressVo", AddressVo.class};
	}
	
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("addressList 들어옴");
		
		AddressVo addressVo = (AddressVo)model.get("addressVo");
		
		ArrayList<AddressVo> addressList = addressDao.addressList(addressVo.getId());
		
		model.put("addressList", addressList);
		
		return "/webServer/addressListResult.jsp";
	}
	
}
