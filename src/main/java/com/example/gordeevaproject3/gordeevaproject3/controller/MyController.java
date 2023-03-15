package com.example.gordeevaproject3.gordeevaproject3.controller;

import com.example.gordeevaproject3.gordeevaproject3.model.Request;
import com.example.gordeevaproject3.gordeevaproject3.model.Response;
import com.example.gordeevaproject3.gordeevaproject3.service.MyModifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

    private final MyModifyService myModifyService;
    @Autowired
    public MyController(@Qualifier("id1") MyModifyService myModifyService) {
        this.myModifyService = myModifyService;
    }

    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@RequestBody Request request) {

        log.info("Входящий request : " + request);

        Response response = Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build();
        Response responseAfterModify = myModifyService.modify(response);

        return new ResponseEntity<>(responseAfterModify, HttpStatus.OK);
    }
}
