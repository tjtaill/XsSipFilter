package com.broadsoft;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by ttaillefer on 5/12/2015.
 */
public class SipPrinterListener extends XsLogBaseListener {
    @Override
    public void enterSipMessage(@NotNull XsLogParser.SipMessageContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void enterDirectionLine(@NotNull XsLogParser.DirectionLineContext ctx) {
        System.out.println(ctx.DIRECTION_LINE().getText());
    }
}
