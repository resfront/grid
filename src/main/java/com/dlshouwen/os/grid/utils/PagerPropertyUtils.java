package com.dlshouwen.os.grid.utils;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.dlshouwen.os.grid.model.Column;
import com.dlshouwen.os.grid.model.Condition;
import com.dlshouwen.os.grid.model.Pager;
import com.dlshouwen.os.grid.model.Sort;

/**
 * Pager属性映射工具类
 * @author 大连首闻科技有限公司
 * @since 2014-10-13 16:35:56
 */
@SuppressWarnings("rawtypes")
public class PagerPropertyUtils {
	
	/**
	 * 将JSON对象映射为Pager对象
	 * @param JSONObject 原JSON对象
	 * @throws Exception
	 */
	public static Pager copy(JSONObject object) throws Exception{
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("parameters", Map.class);
		classMap.put("fastQueryParameters", Map.class);
		classMap.put("advanceQueryConditions", Condition.class);
		classMap.put("advanceQuerySorts", Sort.class);
		classMap.put("exhibitDatas", Map.class);
		classMap.put("exportColumns", Column.class);
		classMap.put("exportDatas", Map.class);
		Pager pager = (Pager)JSONObject.toBean(object, Pager.class, classMap);
		return pager;
	}
	
}