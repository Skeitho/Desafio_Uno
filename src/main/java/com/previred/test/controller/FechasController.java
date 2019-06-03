package com.previred.test.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.previred.test.dto.GDDDTO;
import com.previred.test.dto.GDDFaltantesDTO;
import com.previred.test.services.GDDService;
import com.previred.test.util.Consume;

@RestController
@RequestMapping("/periodos")
public class FechasController {

	GDDService gddService = new GDDService();
	
	@Resource
	Environment env;

	@RequestMapping(method = RequestMethod.GET, value = "/fechas-faltantes", produces = "application/json")
	public String fechasFaltantes() {

		GDDDTO gddDTO = new GDDDTO();
		Consume consume = new Consume();
		GDDFaltantesDTO gddFaltantesDTO = new GDDFaltantesDTO();

		gddDTO = consume.consume(env.getProperty("rest.service.gdd"));

		gddFaltantesDTO = gddService.addDate(gddDTO);

		return gddFaltantesDTO.toString();
	}
}
