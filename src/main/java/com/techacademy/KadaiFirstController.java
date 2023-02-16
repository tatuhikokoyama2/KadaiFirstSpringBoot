package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{ymd}")
    public String dispDayOfWeek(@PathVariable String ymd) {
        Calendar calendar = Calendar.getInstance();

        //取得した指定日の変数を年、月、日に分割する
        int year = Integer.parseInt(ymd.substring(0,4));

        int month = Integer.parseInt(ymd.substring(4,6));

        int day = Integer.parseInt(ymd.substring(6,8));

        //取得した日をカレンダーにセットする
        calendar.set(year,month,day);

        int weeknum = calendar.get(Calendar.DAY_OF_WEEK);

        String week = null;

        //取得した日の曜日に合った曜日を呼び出す
        switch(weeknum) {
        case Calendar.MONDAY:
            week = "Monday";
            break;
        case Calendar.TUESDAY:
            week = "Tuesday";
            break;
        case Calendar.WEDNESDAY:
            week = "Wednesday";
            break;
        case Calendar.THURSDAY:
            week = "Thursday";
            break;
        case Calendar.FRIDAY:
            week = "Friday";
            break;
        case Calendar.SATURDAY:
            week = "Saturday";
            break;
        case Calendar.SUNDAY:
            week = "Sunday";
            break;

            default: break;
        }

        return "指定日:" + week;
    }

    //足し算
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;

        return "計算結果:" + res;
    }

    //引き算
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMiuns(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;

        return "計算結果" + res;
    }

    //掛け算
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;

        return "計算結果" + res;
    }

    //割り算
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;

        return "計算結果" + res;
    }
}
