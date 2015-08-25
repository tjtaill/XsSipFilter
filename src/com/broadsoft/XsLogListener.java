// Generated from C:/code/java/XsSipFilter/src\XsLog.g4 by ANTLR 4.5
package com.broadsoft;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XsLogParser}.
 */
public interface XsLogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XsLogParser#xsLog}.
	 * @param ctx the parse tree
	 */
	void enterXsLog(@NotNull XsLogParser.XsLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#xsLog}.
	 * @param ctx the parse tree
	 */
	void exitXsLog(@NotNull XsLogParser.XsLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#xsLogItem}.
	 * @param ctx the parse tree
	 */
	void enterXsLogItem(@NotNull XsLogParser.XsLogItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#xsLogItem}.
	 * @param ctx the parse tree
	 */
	void exitXsLogItem(@NotNull XsLogParser.XsLogItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sipMessage}.
	 * @param ctx the parse tree
	 */
	void enterSipMessage(@NotNull XsLogParser.SipMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sipMessage}.
	 * @param ctx the parse tree
	 */
	void exitSipMessage(@NotNull XsLogParser.SipMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sipResponse}.
	 * @param ctx the parse tree
	 */
	void enterSipResponse(@NotNull XsLogParser.SipResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sipResponse}.
	 * @param ctx the parse tree
	 */
	void exitSipResponse(@NotNull XsLogParser.SipResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#responseLine}.
	 * @param ctx the parse tree
	 */
	void enterResponseLine(@NotNull XsLogParser.ResponseLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#responseLine}.
	 * @param ctx the parse tree
	 */
	void exitResponseLine(@NotNull XsLogParser.ResponseLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sipRequest}.
	 * @param ctx the parse tree
	 */
	void enterSipRequest(@NotNull XsLogParser.SipRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sipRequest}.
	 * @param ctx the parse tree
	 */
	void exitSipRequest(@NotNull XsLogParser.SipRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#requestLine}.
	 * @param ctx the parse tree
	 */
	void enterRequestLine(@NotNull XsLogParser.RequestLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#requestLine}.
	 * @param ctx the parse tree
	 */
	void exitRequestLine(@NotNull XsLogParser.RequestLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sipHeader}.
	 * @param ctx the parse tree
	 */
	void enterSipHeader(@NotNull XsLogParser.SipHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sipHeader}.
	 * @param ctx the parse tree
	 */
	void exitSipHeader(@NotNull XsLogParser.SipHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sipBody}.
	 * @param ctx the parse tree
	 */
	void enterSipBody(@NotNull XsLogParser.SipBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sipBody}.
	 * @param ctx the parse tree
	 */
	void exitSipBody(@NotNull XsLogParser.SipBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(@NotNull XsLogParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(@NotNull XsLogParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sdp}.
	 * @param ctx the parse tree
	 */
	void enterSdp(@NotNull XsLogParser.SdpContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sdp}.
	 * @param ctx the parse tree
	 */
	void exitSdp(@NotNull XsLogParser.SdpContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#sdpLine}.
	 * @param ctx the parse tree
	 */
	void enterSdpLine(@NotNull XsLogParser.SdpLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#sdpLine}.
	 * @param ctx the parse tree
	 */
	void exitSdpLine(@NotNull XsLogParser.SdpLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#dateTimeLine}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLine(@NotNull XsLogParser.DateTimeLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#dateTimeLine}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLine(@NotNull XsLogParser.DateTimeLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#directionLine}.
	 * @param ctx the parse tree
	 */
	void enterDirectionLine(@NotNull XsLogParser.DirectionLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#directionLine}.
	 * @param ctx the parse tree
	 */
	void exitDirectionLine(@NotNull XsLogParser.DirectionLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XsLogParser#unknownLine}.
	 * @param ctx the parse tree
	 */
	void enterUnknownLine(@NotNull XsLogParser.UnknownLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsLogParser#unknownLine}.
	 * @param ctx the parse tree
	 */
	void exitUnknownLine(@NotNull XsLogParser.UnknownLineContext ctx);
}