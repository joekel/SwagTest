package controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import model.Test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam; 
import io.swagger.annotations.ApiResponse; 
import io.swagger.annotations.ApiResponses; 

@RestController
@Api(tags = "Availability") 
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)

    @ApiOperation(value = "Create availability metric.", notes = "Same notes as creating gauge metric apply.") 
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "Metric created successfully"), 
            @ApiResponse(code = 400, message = "Missing or invalid payload"), 
            @ApiResponse(code = 409, message = "Availability metric with given id already exists"), 
            @ApiResponse(code = 500, message = "Metric creation failed due to an unexpected error") 
    }) 
	public ResponseEntity<Test> test() {
		System.out.println("GET - Method");
		Test test  = new Test();
		test.setAddress("Address");
		test.setName("jaber");
		ResponseEntity<Test> responseEntity = new ResponseEntity<>(test, HttpStatus.OK);
		return responseEntity;
	}

}