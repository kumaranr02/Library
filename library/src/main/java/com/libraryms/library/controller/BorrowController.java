package com.libraryms.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryms.library.service.BorrowService;

@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @PostMapping("/{memberId}/{isbn}")
    public String borrowBook(@PathVariable String memberId, @PathVariable String isbn) {
        return borrowService.borrowService(memberId, isbn);
    }

    @PostMapping("/return/{memberId}/{isbn}")
    public String returnBook(@PathVariable String memberId, @PathVariable String isbn) {
        return borrowService.returnService(memberId, isbn);
    }
}