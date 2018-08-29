package com.manashiki.uchilearte.wrapper;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MapperWrapper {

	public static String  mapperWrapper(WrapperUchileArte wrapperUchileArte){
		
		String wrapper = null;
		
		ObjectMapper objectMapper;
		
		SimpleDateFormat sdf;
		
		objectMapper = new ObjectMapper();
		
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		
		objectMapper.setDateFormat(sdf);
		
		objectMapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	
		try {
			
			wrapper = objectMapper.writeValueAsString(wrapperUchileArte);

			wrapper = wrapper.replace("null", "\"\"");
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return wrapper;
	}
}
