// Generated from C:/code/java/XsSipFilter/src\XsLog.g4 by ANTLR 4.5
package com.broadsoft;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XsLogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESPONSE_LINE=1, RESPONSE_CODE=2, METHOD=3, REQUEST_LINE=4, SIP_VERSION=5, 
		NOT_SPACE=6, SIP_URL=7, HEADER_CHAR=8, SIP_HEADER=9, XML=10, SDP_LINE=11, 
		WS=12, DIGIT=13, YEAR=14, MONTH=15, DAY=16, DATE=17, HOURS=18, MINUTES=19, 
		SECONDS=20, FRACTION=21, TIME=22, SPACE=23, NEWLINE=24, DATE_TIME=25, 
		DATE_TIME_LINE=26, DIRECTION=27, IP=28, DIRECTION_LINE=29, UNKNOWN_LINE=30;
	public static final int
		RULE_xsLog = 0, RULE_xsLogItem = 1, RULE_sipMessage = 2, RULE_sipResponse = 3, 
		RULE_responseLine = 4, RULE_sipRequest = 5, RULE_requestLine = 6, RULE_sipHeader = 7, 
		RULE_sipBody = 8, RULE_xml = 9, RULE_sdp = 10, RULE_sdpLine = 11, RULE_dateTimeLine = 12, 
		RULE_directionLine = 13, RULE_unknownLine = 14;
	public static final String[] ruleNames = {
		"xsLog", "xsLogItem", "sipMessage", "sipResponse", "responseLine", "sipRequest", 
		"requestLine", "sipHeader", "sipBody", "xml", "sdp", "sdpLine", "dateTimeLine", 
		"directionLine", "unknownLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'SIP/2.0'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RESPONSE_LINE", "RESPONSE_CODE", "METHOD", "REQUEST_LINE", "SIP_VERSION", 
		"NOT_SPACE", "SIP_URL", "HEADER_CHAR", "SIP_HEADER", "XML", "SDP_LINE", 
		"WS", "DIGIT", "YEAR", "MONTH", "DAY", "DATE", "HOURS", "MINUTES", "SECONDS", 
		"FRACTION", "TIME", "SPACE", "NEWLINE", "DATE_TIME", "DATE_TIME_LINE", 
		"DIRECTION", "IP", "DIRECTION_LINE", "UNKNOWN_LINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XsLog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XsLogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XsLogContext extends ParserRuleContext {
		public List<XsLogItemContext> xsLogItem() {
			return getRuleContexts(XsLogItemContext.class);
		}
		public XsLogItemContext xsLogItem(int i) {
			return getRuleContext(XsLogItemContext.class,i);
		}
		public XsLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xsLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterXsLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitXsLog(this);
		}
	}

	public final XsLogContext xsLog() throws RecognitionException {
		XsLogContext _localctx = new XsLogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xsLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); 
				xsLogItem();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESPONSE_LINE) | (1L << REQUEST_LINE) | (1L << DATE_TIME_LINE) | (1L << DIRECTION_LINE) | (1L << UNKNOWN_LINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XsLogItemContext extends ParserRuleContext {
		public DateTimeLineContext dateTimeLine() {
			return getRuleContext(DateTimeLineContext.class,0);
		}
		public DirectionLineContext directionLine() {
			return getRuleContext(DirectionLineContext.class,0);
		}
		public SipMessageContext sipMessage() {
			return getRuleContext(SipMessageContext.class,0);
		}
		public UnknownLineContext unknownLine() {
			return getRuleContext(UnknownLineContext.class,0);
		}
		public XsLogItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xsLogItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterXsLogItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitXsLogItem(this);
		}
	}

	public final XsLogItemContext xsLogItem() throws RecognitionException {
		XsLogItemContext _localctx = new XsLogItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xsLogItem);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case DATE_TIME_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); 
				dateTimeLine();
				}
				break;
			case DIRECTION_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); 
				directionLine();
				}
				break;
			case RESPONSE_LINE:
			case REQUEST_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); 
				sipMessage();
				}
				break;
			case UNKNOWN_LINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(38); 
				unknownLine();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SipMessageContext extends ParserRuleContext {
		public SipResponseContext sipResponse() {
			return getRuleContext(SipResponseContext.class,0);
		}
		public SipRequestContext sipRequest() {
			return getRuleContext(SipRequestContext.class,0);
		}
		public SipMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sipMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSipMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSipMessage(this);
		}
	}

	public final SipMessageContext sipMessage() throws RecognitionException {
		SipMessageContext _localctx = new SipMessageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sipMessage);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case RESPONSE_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); 
				sipResponse();
				}
				break;
			case REQUEST_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); 
				sipRequest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SipResponseContext extends ParserRuleContext {
		public ResponseLineContext responseLine() {
			return getRuleContext(ResponseLineContext.class,0);
		}
		public List<SipHeaderContext> sipHeader() {
			return getRuleContexts(SipHeaderContext.class);
		}
		public SipHeaderContext sipHeader(int i) {
			return getRuleContext(SipHeaderContext.class,i);
		}
		public SipBodyContext sipBody() {
			return getRuleContext(SipBodyContext.class,0);
		}
		public SipResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sipResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSipResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSipResponse(this);
		}
	}

	public final SipResponseContext sipResponse() throws RecognitionException {
		SipResponseContext _localctx = new SipResponseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sipResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			responseLine();
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46); 
				sipHeader();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIP_HEADER );
			setState(52);
			_la = _input.LA(1);
			if (_la==XML || _la==SDP_LINE) {
				{
				setState(51); 
				sipBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResponseLineContext extends ParserRuleContext {
		public TerminalNode RESPONSE_LINE() { return getToken(XsLogParser.RESPONSE_LINE, 0); }
		public ResponseLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterResponseLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitResponseLine(this);
		}
	}

	public final ResponseLineContext responseLine() throws RecognitionException {
		ResponseLineContext _localctx = new ResponseLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_responseLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			match(RESPONSE_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SipRequestContext extends ParserRuleContext {
		public RequestLineContext requestLine() {
			return getRuleContext(RequestLineContext.class,0);
		}
		public List<SipHeaderContext> sipHeader() {
			return getRuleContexts(SipHeaderContext.class);
		}
		public SipHeaderContext sipHeader(int i) {
			return getRuleContext(SipHeaderContext.class,i);
		}
		public SdpContext sdp() {
			return getRuleContext(SdpContext.class,0);
		}
		public SipRequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sipRequest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSipRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSipRequest(this);
		}
	}

	public final SipRequestContext sipRequest() throws RecognitionException {
		SipRequestContext _localctx = new SipRequestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sipRequest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			requestLine();
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57); 
				sipHeader();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIP_HEADER );
			setState(63);
			_la = _input.LA(1);
			if (_la==SDP_LINE) {
				{
				setState(62); 
				sdp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequestLineContext extends ParserRuleContext {
		public TerminalNode REQUEST_LINE() { return getToken(XsLogParser.REQUEST_LINE, 0); }
		public RequestLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterRequestLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitRequestLine(this);
		}
	}

	public final RequestLineContext requestLine() throws RecognitionException {
		RequestLineContext _localctx = new RequestLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_requestLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			match(REQUEST_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SipHeaderContext extends ParserRuleContext {
		public TerminalNode SIP_HEADER() { return getToken(XsLogParser.SIP_HEADER, 0); }
		public SipHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sipHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSipHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSipHeader(this);
		}
	}

	public final SipHeaderContext sipHeader() throws RecognitionException {
		SipHeaderContext _localctx = new SipHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sipHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			match(SIP_HEADER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SipBodyContext extends ParserRuleContext {
		public SdpContext sdp() {
			return getRuleContext(SdpContext.class,0);
		}
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public SipBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sipBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSipBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSipBody(this);
		}
	}

	public final SipBodyContext sipBody() throws RecognitionException {
		SipBodyContext _localctx = new SipBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sipBody);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case SDP_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); 
				sdp();
				}
				break;
			case XML:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				xml();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlContext extends ParserRuleContext {
		public TerminalNode XML() { return getToken(XsLogParser.XML, 0); }
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterXml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitXml(this);
		}
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			match(XML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SdpContext extends ParserRuleContext {
		public List<SdpLineContext> sdpLine() {
			return getRuleContexts(SdpLineContext.class);
		}
		public SdpLineContext sdpLine(int i) {
			return getRuleContext(SdpLineContext.class,i);
		}
		public SdpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sdp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSdp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSdp(this);
		}
	}

	public final SdpContext sdp() throws RecognitionException {
		SdpContext _localctx = new SdpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sdp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); 
				sdpLine();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SDP_LINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SdpLineContext extends ParserRuleContext {
		public TerminalNode SDP_LINE() { return getToken(XsLogParser.SDP_LINE, 0); }
		public SdpLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sdpLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterSdpLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitSdpLine(this);
		}
	}

	public final SdpLineContext sdpLine() throws RecognitionException {
		SdpLineContext _localctx = new SdpLineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sdpLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			match(SDP_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeLineContext extends ParserRuleContext {
		public TerminalNode DATE_TIME_LINE() { return getToken(XsLogParser.DATE_TIME_LINE, 0); }
		public DateTimeLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterDateTimeLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitDateTimeLine(this);
		}
	}

	public final DateTimeLineContext dateTimeLine() throws RecognitionException {
		DateTimeLineContext _localctx = new DateTimeLineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dateTimeLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			match(DATE_TIME_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionLineContext extends ParserRuleContext {
		public TerminalNode DIRECTION_LINE() { return getToken(XsLogParser.DIRECTION_LINE, 0); }
		public DirectionLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterDirectionLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitDirectionLine(this);
		}
	}

	public final DirectionLineContext directionLine() throws RecognitionException {
		DirectionLineContext _localctx = new DirectionLineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_directionLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			match(DIRECTION_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownLineContext extends ParserRuleContext {
		public TerminalNode UNKNOWN_LINE() { return getToken(XsLogParser.UNKNOWN_LINE, 0); }
		public UnknownLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).enterUnknownLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XsLogListener ) ((XsLogListener)listener).exitUnknownLine(this);
		}
	}

	public final UnknownLineContext unknownLine() throws RecognitionException {
		UnknownLineContext _localctx = new UnknownLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unknownLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			match(UNKNOWN_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 [\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16\2#\3\3"+
		"\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\5\4.\n\4\3\5\3\5\6\5\62\n\5\r\5\16\5\63"+
		"\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\6\7=\n\7\r\7\16\7>\3\7\5\7B\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\5\nJ\n\n\3\13\3\13\3\f\6\fO\n\f\r\f\16\fP\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36\2\2V\2!\3\2\2\2\4)\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n8\3\2\2\2"+
		"\f:\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22I\3\2\2\2\24K\3\2\2\2\26N\3\2\2"+
		"\2\30R\3\2\2\2\32T\3\2\2\2\34V\3\2\2\2\36X\3\2\2\2 \"\5\4\3\2! \3\2\2"+
		"\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%*\5\32\16\2&*\5\34\17\2\'"+
		"*\5\6\4\2(*\5\36\20\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2"+
		"\2\2+.\5\b\5\2,.\5\f\7\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\61\5\n\6\2\60"+
		"\62\5\20\t\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\66\3\2\2\2\65\67\5\22\n\2\66\65\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\289"+
		"\7\3\2\29\13\3\2\2\2:<\5\16\b\2;=\5\20\t\2<;\3\2\2\2=>\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?A\3\2\2\2@B\5\26\f\2A@\3\2\2\2AB\3\2\2\2B\r\3\2\2\2CD\7\6"+
		"\2\2D\17\3\2\2\2EF\7\13\2\2F\21\3\2\2\2GJ\5\26\f\2HJ\5\24\13\2IG\3\2\2"+
		"\2IH\3\2\2\2J\23\3\2\2\2KL\7\f\2\2L\25\3\2\2\2MO\5\30\r\2NM\3\2\2\2OP"+
		"\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\27\3\2\2\2RS\7\r\2\2S\31\3\2\2\2TU\7\34"+
		"\2\2U\33\3\2\2\2VW\7\37\2\2W\35\3\2\2\2XY\7 \2\2Y\37\3\2\2\2\13#)-\63"+
		"\66>AIP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}