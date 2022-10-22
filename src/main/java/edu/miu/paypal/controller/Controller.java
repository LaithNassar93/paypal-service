package edu.miu.paypal.controller;

import edu.miu.paypal.model.PaymentRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paypal")
public class Controller {

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentRequest paymentRequest){
        return "Successfully Transferred $"+paymentRequest.getPrice()+" From your Paypal account";
    }
}
