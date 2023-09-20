package com.minori.namemanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameservice) {
        this.nameService = nameservice;
    }

    @GetMapping("/names")
    public List<Name> getName() {
        List<Name> names = nameService.getNames();
        return names;
    }
}
