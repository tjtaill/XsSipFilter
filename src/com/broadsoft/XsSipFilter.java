package com.broadsoft;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class XsSipFilter {

    public static void main(String[] args) throws IOException {
        System.err.close();

        // ANTLRInputStream input = new ANTLRInputStream( new FileInputStream( new File(args[0])) );
        ANTLRInputStream input = new ANTLRInputStream( new InputStreamReader(System.in) );

        XsLogLexer lexer = new XsLogLexer( input );

        CommonTokenStream tokens = new CommonTokenStream( lexer );

        XsLogParser parser = new XsLogParser( tokens );

        ParseTree tree = parser.xsLog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SipPrinterListener(), tree);

    }
}
