package com.timestamp.controller;

import com.timestamp.model.Timestamp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Locale;

/**
 * Created by parvinder.kumar on 2/28/2017.
 */
@Controller
@RequestMapping("/")
public class TimestampController {

    Timestamp timestamp1=new Timestamp();

        @RequestMapping("/")
       public String index(Model model){
            model.addAttribute("test","test");
            return "index";
        }

    @RequestMapping("/{timestamp}")
    public @ResponseBody  Timestamp  show(@PathVariable("timestamp") String timestamp, Model model) throws ParseException{
        System.out.print("test");

        String dateString =timestamp;
        Long unixDate = null;
        Date date=null;
        if(dateString==null || dateString==""){
            timestamp1.setUnixdate(Long.parseLong("null"));
            timestamp1.setNaturalTimestamp(null);
            return  timestamp1;
        }
        if(dateString.matches("\\d+")){
            System.out.print("unix");
             timestamp1.setUnixdate(Long.parseLong(dateString));
            date=new Date(Long.parseLong(dateString)*1000);
           String naturalTimestamp= date.toString();
            timestamp1.setNaturalTimestamp(naturalTimestamp);
           return timestamp1;
        }

        else {
            model.addAttribute("naturalTimestamp",dateString);
            timestamp1.setNaturalTimestamp(dateString);
            DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));

            try {
                date = format.parse(dateString);
                // date = DateUtils.parseDate(strDate, Locale.ENGLISH, datePatterns);
            } catch (ParseException ex) {
                //input date is invalid

            }
            unixDate = date.getTime() / 1000;
            timestamp1.setUnixdate(unixDate);
            return timestamp1;
        }


    }
}
