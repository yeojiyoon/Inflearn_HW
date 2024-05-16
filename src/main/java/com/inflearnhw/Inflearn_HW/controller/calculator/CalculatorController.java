package com.inflearnhw.Inflearn_HW.controller.calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inflearnhw.Inflearn_HW.dto.calculator.response.CalculatorResponse;

@RestController //HW1
public class CalculatorController {
    
    @GetMapping("/api/v1/calc")
    public CalculatorResponse getCalc(
        @RequestParam("num1") int num1,
        @RequestParam("num2") int num2
    ) 
    {
        CalculatorResponse response = new CalculatorResponse(num1, num2);
        return response;
    }
    
}
