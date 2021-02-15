package webServer;

import java.util.ArrayList;
import java.util.Map;

import projectControls.Component;
import projectControls.Controller;
import projectControls.DataBinding;
import webServerDao.OrderDao;
import webServerDto.OrderVo;
import webServerDto.UserVo;

@Component("/webServer/orderList.do")
public class OrderList implements Controller, DataBinding{
	
	private OrderDao orderDao;
	public OrderList setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
		return this;
	}

	
	@Override
	public Object[] getDataBinders() {
		
		return new Object[] {"id", String.class};
	}
	
	
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		System.out.println("orderList 들어옴");
		
//		int orderTotal = 0;
	
//		System.out.println("orderVo.getId() => " + id);
		ArrayList<OrderVo> orderList = orderDao.orderList((String)model.get("id"));
		
		System.out.println("orderList toString : " + orderList.toString());
		
//		for(OrderVo order : orderList) {
//			orderTotal += order.getPrice2() * order.getQuantity();
//		}

		model.put("orderList", orderList);
//		model.put("orderTotal", orderTotal);
			

		return "/webServer/orderListResult.jsp";
	}
}
