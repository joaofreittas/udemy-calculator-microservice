package br.com.udemy.calculatorapp.controller;

import br.com.udemy.calculatorapp.service.MathService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
@RequiredArgsConstructor
public class MathController {

    private final MathService mathService;

    @GetMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable String n1, @PathVariable String n2) {
        return mathService.sum(n1, n2);
    }

    @GetMapping("/subtract/{n1}/{n2}")
    public Double subtract(@PathVariable String n1, @PathVariable String n2) {
        return mathService.subtract(n1, n2);
    }

    @GetMapping("/divide/{n1}/{n2}")
    public Double divide(@PathVariable String n1, @PathVariable String n2) {
        return mathService.divide(n1, n2);
    }

    @GetMapping("/multiply/{n1}/{n2}")
    public Double multiply(@PathVariable String n1, @PathVariable String n2) {
        return mathService.multiply(n1, n2);
    }

    @GetMapping("/square/{n1}")
    public Double square(@PathVariable String n1) {
        return mathService.square(n1);
    }

    @GetMapping("/average/{n1}")
    public Double average(@PathVariable String n1, @PathVariable String n2) {
        return mathService.average(n1, n2);
    }

}
