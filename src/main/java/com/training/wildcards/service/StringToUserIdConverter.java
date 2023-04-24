package com.training.wildcards.service;

import com.training.wildcards.model.UserId;
import org.springframework.lang.NonNull;
import org.springframework.core.convert.converter.Converter;

public class StringToUserIdConverter implements Converter<String, UserId> {
    @Override
    public UserId convert(@NonNull String source) {
        return new UserId(Long.parseLong(source));
    }

//    @Override
//    public <U> Converter<String, U> andThen(Converter<? super UserId, ? extends U> after) {
//        return Converter.super.andThen(after);
//    }
}
