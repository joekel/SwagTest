package model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( value = "test", description = "Test resource representation" )
public class Test {
	 @ApiModelProperty( value = "Test's  name", required = true ) 
    private String name;
	 @ApiModelProperty( value = "Test's address", required = false ) 
    private String address;
    
    public Test() {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    // other setter getter
}
     
  