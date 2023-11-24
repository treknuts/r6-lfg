package dev.treknuts.lfg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @GetMapping(value = "", produces = "application/json")
    public List<String> getGroups() {
        return List.of("Group 1", "Group 2", "Group 4", "etc", "etc");
    }

}
