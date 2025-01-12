package com.ll.spring_doc.standard.search;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SearchKeywordTypeV1 {
    title("title"),
    content("content");
    private final String value;
}