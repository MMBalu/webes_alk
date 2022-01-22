package hu.unimiskolc.mmb.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/book")
public class BookController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({MethodArgumentNotValidException.class})
    String addHiba(){
        return "Validálás sikertelen!";
    }

    @PostMapping ("/add")
    String addBook(@Valid @RequestBody BookDto newbook){
        return "Validálás OK!\n" + newbook;
    }

}
