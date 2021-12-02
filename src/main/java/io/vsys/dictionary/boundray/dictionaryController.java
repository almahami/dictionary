package io.vsys.dictionary.boundray;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import io.vsys.dictionary.domain.DictionaryBook;
import io.vsys.dictionary.service.DictionaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class dictionaryController {
    
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping(value="/dictionary")
    public String getDictionary(Model model) {
        
        List<DictionaryBook> allWord= dictionaryService.getDictionary();
        model.addAttribute("words", allWord);

        return "dictionary";
        
    }

    @PostMapping(value="/add")
    public String addContent(@RequestParam String word, @RequestParam String mean, Model model) {
        //TODO: process POST request
        dictionaryService.save(word, mean);
        
        return "redirect:dictionary";
    }
    
    //TODO: get the addFOrm
    @RequestMapping(value="/add")
    public String formadd(Model model) {
        return "add";
    }
    
}
