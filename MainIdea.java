package com.apsaras.plugin.boot;


import com.apsaras.plugin.context.GeneraotrContainer;
import com.apsaras.plugin.domain.RootBag;
import com.apsaras.plugin.parser.DocumentParser;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



public class MainIdea {



    public static void main(String[] args) throws IOException {

        //   InputStream is = new FileInputStream("D:\\网银二期\\网银渠道SVN\\技术类\\04概要设计类\\接口文档\\接口合稿\\渠道平台接口规范-httpV1.0-合稿（0511）-（合版）.docx");
        InputStream is = new FileInputStream("C:\\Users\\永丰基地\\Desktop\\组合验证接口.docx");
        XWPFDocument doc = new XWPFDocument(is);
        RootBag rootBag =new RootBag();
        DocumentParser parserImpl =new DocumentParser(doc,rootBag);
        parserImpl.doParser();
        is.close();
        GeneraotrContainer generaotrContainer =new GeneraotrContainer();
        generaotrContainer.setBag(rootBag);
        generaotrContainer.start();
    }


}
