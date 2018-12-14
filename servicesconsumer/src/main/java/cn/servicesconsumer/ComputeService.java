package cn.servicesconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class ComputeService {
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="addFallbackMethod")
	 public String addService(Integer a, Integer b) {
		String num1 = String.valueOf(a);
		String num2 = String.valueOf(b);
		String url = "http://COMPUTE-SERVICE/add?a="+num1+"&b="+num2;
        return restTemplate.getForEntity(url, String.class).getBody();
    } 
	public String addFallbackMethod(Integer a, Integer b){
		return "错误";
	}

}
