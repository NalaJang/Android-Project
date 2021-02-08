package webServer;

import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.AddressDao;
import webServerDto.UserVo;

@Component("/webServer/selectResult.do")
public class AddressResult implements DataBinding, Controller{
	
	private AddressDao addressDao;
	public AddressResult setAddressDao (AddressDao addressDao) {
		this.addressDao = addressDao;
		return this;
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		UserVo userVo = (UserVo)model.get("userVo");
		addressDao.selectResult(userVo.getId());
		
		return "redirect:../webServer/insertAddress.do";
	}

	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"usreVo", UserVo.class};
	}

}
