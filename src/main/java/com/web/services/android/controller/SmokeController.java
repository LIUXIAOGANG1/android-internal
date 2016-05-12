package com.web.services.android.controller;

import java.nio.charset.Charset;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.services.android.beans.SmokeData;
import com.web.services.android.service.SmokeService;
import com.web.services.android.utils.JsonTools;

@Controller
@RequestMapping("/smoke")
public class SmokeController {

	private static final Logger logger = LoggerFactory.getLogger(SmokeController.class);

	@Resource
	private SmokeService smokeService;
	
	@ResponseBody
	@RequestMapping(value = "/getfactorys.html", method = RequestMethod.POST)
	public ResponseEntity<String> getAllFactory() {
		logger.info("[SmokeController] getAllFactory() 请求获得烟尘采样工厂。");

		HttpHeaders headers = new HttpHeaders();
		MediaType mediaType = new MediaType("text", "html", Charset.forName("UTF-8"));
		headers.setContentType(mediaType);

		List<String> factorys = smokeService.getAllFactory();
		String result = JsonTools.createJsonString("Factorys", factorys);
		logger.info("[SmokeController] getAllFactory() 准备返回数据:{}", factorys);

		return new ResponseEntity<String>(result, headers, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getpollutions.html", method = RequestMethod.POST)
	public ResponseEntity<String> getPollutionByFactory(String factory) {
		logger.info("[SmokeController] getPollutionByFactory() 请求获得烟尘采样中 {} 工厂下的所有污染源。", factory);

		HttpHeaders headers = new HttpHeaders();
		MediaType mediaType = new MediaType("text", "html", Charset.forName("UTF-8"));
		headers.setContentType(mediaType);

		List<String> pollutions = smokeService.getPollutionByFactory(factory);
		String result = JsonTools.createJsonString("Pollutions", pollutions);
		logger.info("[SmokeController] getPollutionByFactory() 准备返回数据:{}", pollutions);

		return new ResponseEntity<String>(result, headers, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getpollutiondata.html", method = RequestMethod.POST)
	public ResponseEntity<String> getPollutionData(String factory, String pollution, String startTime, String endTime, int page) {
		logger.info("[SmokeController] getPollutionData() 通过参数 factory: {}, pollution: {}, startTime: {}, endTime: {}, page: {} 获取水质污染数据。", factory, pollution, startTime, endTime, page);

		HttpHeaders headers = new HttpHeaders();
		MediaType mediaType = new MediaType("text", "html", Charset.forName("UTF-8"));
		headers.setContentType(mediaType);

		List<SmokeData> list = smokeService.findByQuery(factory, pollution, startTime, endTime, page);
		String result = JsonTools.createJsonString("SmokeDatas", list);
		logger.info("[SmokeController] getPollutionData() 准备返回数据:{}", result);

		return new ResponseEntity<String>(result, headers, HttpStatus.OK);
	}
}
