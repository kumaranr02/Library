package com.libraryms.library.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryms.library.dal.IBorrowDAO;

@Service
public class BorrowService {
    @Autowired
    IBorrowDAO iBorrowDAO;

    public String borrowService(String memberId, String isbn){
        return iBorrowDAO.borrowBook(memberId, isbn);
    }
    public String returnService(String memberId, String isbn){
        return iBorrowDAO.returnBook(memberId, isbn);
    }
}
