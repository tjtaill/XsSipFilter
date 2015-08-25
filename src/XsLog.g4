grammar XsLog;


xsLog : xsLogItem+;
          
          
xsLogItem : dateTimeLine | directionLine | sipMessage | unknownLine;



sipMessage : sipResponse | sipRequest;

sipResponse : responseLine sipHeader+ sipBody?;
 
RESPONSE_LINE : 'SIP/2.0' .*? RESPONSE_CODE .*? '\n';

responseLine : RESPONSE_LINE;

                 
RESPONSE_CODE : DIGIT DIGIT DIGIT;

METHOD : 'INVITE' | 
         'ACK' |
         'BYE' |
         'CANCEL' |
         'OPTIONS' |
         'REGISTER' |
         'PRACK' |
         'SUBSCRIBE' |
         'NOTIFY'|
         'PUBLISH' |
         'INFO' |
         'REFER' |
         'MESSAGE' |
         'UPDATE' ;

sipRequest : requestLine sipHeader+ sdp?;

requestLine : REQUEST_LINE;

REQUEST_LINE : METHOD ' '+ SIP_URL ' '+ SIP_VERSION NEWLINE; 


SIP_VERSION : 'SIP/2.0';
NOT_SPACE : ~' ';
SIP_URL : 'sip:' NOT_SPACE+;

sipHeader : SIP_HEADER;
HEADER_CHAR : [a-zA-Z.-];
SIP_HEADER : HEADER_CHAR*? ':' .*? NEWLINE;

sipBody : sdp | xml;

xml : XML;
XML : '<?xml' .* '/' .*? '>' NEWLINE NEWLINE;

sdp : sdpLine+;
sdpLine : SDP_LINE;
SDP_LINE : [a-z] '=' .*? NEWLINE;

WS : [ \t\r\n] -> skip;

DIGIT : [0-9];
YEAR : DIGIT DIGIT DIGIT DIGIT;
MONTH : DIGIT DIGIT;
DAY : DIGIT DIGIT;
DATE : YEAR '.' MONTH '.' DAY;

HOURS : DIGIT DIGIT;
MINUTES: DIGIT DIGIT;
SECONDS : DIGIT DIGIT;
FRACTION : DIGIT DIGIT DIGIT;
TIME : HOURS ':' MINUTES ':' SECONDS ':' FRACTION;
SPACE : ' ';
NEWLINE : '\r'? '\n';
DATE_TIME : DATE SPACE TIME;
DATE_TIME_LINE : DATE_TIME .*? NEWLINE; 
dateTimeLine : DATE_TIME_LINE;


DIRECTION : 'IN from'
          | 'OUT to'
          ;
IP : DIGIT+ '.' DIGIT+ '.' DIGIT+ '.' DIGIT+ ':'  DIGIT+;
DIRECTION_LINE : '\t' 'udp ' DIGIT+ ' Bytes ' DIRECTION SPACE IP NEWLINE;
directionLine : DIRECTION_LINE;


unknownLine : UNKNOWN_LINE;
UNKNOWN_LINE: .*? NEWLINE;
