package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pageHelper.DataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TbItemService;

/**
 * 商品管理 Cotroller
 * @author LiuTaiwen
 *
 */
@Controller
public class ItemController {

	@Autowired
	private TbItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public DataGridResult getItemDataGrid(int page , int rows){
		DataGridResult result = itemService.getItemByDataGrid(page, rows);
		return result;
	}
}
