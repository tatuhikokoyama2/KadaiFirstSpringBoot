package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{指定日}")
    public String dispDayOfWeek() {
        String week = LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyy:MM:dd(E)"));

        return "指定日:" + week;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;

        return "計算結果:" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMiuns(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;

        return "計算結果" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;

        return "計算結果" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;

        return "計算結果" + res;
    }
}
