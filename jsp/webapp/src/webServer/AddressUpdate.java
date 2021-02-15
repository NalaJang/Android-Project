package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.AddressDao;
import webServerDto.AddressVo;

@Component("/webServer/addressUpdate.do")
public class AddressUpdate implements Controller, DataBinding {

	private AddressDao addressDao;
	public AddressUpdate setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"no", Integer.class, "addressVo", AddressVo.class};
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		System.out.println("addressUpdate 들어옴");
		
		int no = (Integer)model.get("no");
		AddressVo addressVo = (AddressVo)model.get("addressVo");
		
//		if(addressVo.getId() == null) {
			
//			AddressVo address = addressDao.selectOne(no);
//			model.put("address", addressDao.selectOne(no));
			
//		} else {
		
		if(addressDao.selectOne(no) != null) {
			model.put("addressUpdate", addressDao.update(addressVo));
		}
		
		
			
//		}
		
		
		return "/webServer/addressUpdateResult.jsp";
	}
}
