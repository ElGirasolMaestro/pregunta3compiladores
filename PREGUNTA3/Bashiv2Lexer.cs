//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:/Users/USUARIO/Desktop/design-and-implementation-of-your-own-shell-main/Bashiv2.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public partial class Bashiv2Lexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, WORD=23, ARG=24, STRING=25, 
		NUMBER=26, WS=27, NEWLINE=28, COMMENT=29;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "WORD", "ARG", "STRING", 
		"NUMBER", "WS", "NEWLINE", "COMMENT"
	};


	public Bashiv2Lexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public Bashiv2Lexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'if'", "'then'", "'else'", "'fi'", "'switch'", "'in'", "'{'", "'}'", 
		"'esac'", "'case'", "':'", "'for'", "','", "'do'", "'done'", "'while'", 
		"'='", "'('", "')'", "'&&'", "'||'", "'$'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "WORD", 
		"ARG", "STRING", "NUMBER", "WS", "NEWLINE", "COMMENT"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Bashiv2.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static Bashiv2Lexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,29,189,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
		6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
		7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,
		7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,
		7,28,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,
		4,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,8,
		1,8,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,11,1,11,1,11,1,11,1,12,1,12,1,13,1,
		13,1,13,1,14,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,
		16,1,17,1,17,1,18,1,18,1,19,1,19,1,19,1,20,1,20,1,20,1,21,1,21,1,22,3,
		22,137,8,22,1,22,1,22,5,22,141,8,22,10,22,12,22,144,9,22,1,23,1,23,3,23,
		148,8,23,1,24,1,24,5,24,152,8,24,10,24,12,24,155,9,24,1,24,1,24,1,25,3,
		25,160,8,25,1,25,4,25,163,8,25,11,25,12,25,164,1,26,4,26,168,8,26,11,26,
		12,26,169,1,26,1,26,1,27,3,27,175,8,27,1,27,1,27,1,28,1,28,5,28,181,8,
		28,10,28,12,28,184,9,28,1,28,1,28,1,28,1,28,0,0,29,1,1,3,2,5,3,7,4,9,5,
		11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,
		18,37,19,39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,55,28,57,29,1,
		0,8,1,0,45,45,3,0,65,90,95,95,97,122,4,0,48,57,65,90,95,95,97,122,1,0,
		34,34,2,0,43,43,45,45,1,0,48,57,3,0,9,10,13,13,32,32,3,0,10,10,13,13,47,
		47,197,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,
		1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,
		0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,
		1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,
		0,0,45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,
		1,0,0,0,0,57,1,0,0,0,1,59,1,0,0,0,3,62,1,0,0,0,5,67,1,0,0,0,7,72,1,0,0,
		0,9,75,1,0,0,0,11,82,1,0,0,0,13,85,1,0,0,0,15,87,1,0,0,0,17,89,1,0,0,0,
		19,94,1,0,0,0,21,99,1,0,0,0,23,101,1,0,0,0,25,105,1,0,0,0,27,107,1,0,0,
		0,29,110,1,0,0,0,31,115,1,0,0,0,33,121,1,0,0,0,35,123,1,0,0,0,37,125,1,
		0,0,0,39,127,1,0,0,0,41,130,1,0,0,0,43,133,1,0,0,0,45,136,1,0,0,0,47,147,
		1,0,0,0,49,149,1,0,0,0,51,159,1,0,0,0,53,167,1,0,0,0,55,174,1,0,0,0,57,
		178,1,0,0,0,59,60,5,105,0,0,60,61,5,102,0,0,61,2,1,0,0,0,62,63,5,116,0,
		0,63,64,5,104,0,0,64,65,5,101,0,0,65,66,5,110,0,0,66,4,1,0,0,0,67,68,5,
		101,0,0,68,69,5,108,0,0,69,70,5,115,0,0,70,71,5,101,0,0,71,6,1,0,0,0,72,
		73,5,102,0,0,73,74,5,105,0,0,74,8,1,0,0,0,75,76,5,115,0,0,76,77,5,119,
		0,0,77,78,5,105,0,0,78,79,5,116,0,0,79,80,5,99,0,0,80,81,5,104,0,0,81,
		10,1,0,0,0,82,83,5,105,0,0,83,84,5,110,0,0,84,12,1,0,0,0,85,86,5,123,0,
		0,86,14,1,0,0,0,87,88,5,125,0,0,88,16,1,0,0,0,89,90,5,101,0,0,90,91,5,
		115,0,0,91,92,5,97,0,0,92,93,5,99,0,0,93,18,1,0,0,0,94,95,5,99,0,0,95,
		96,5,97,0,0,96,97,5,115,0,0,97,98,5,101,0,0,98,20,1,0,0,0,99,100,5,58,
		0,0,100,22,1,0,0,0,101,102,5,102,0,0,102,103,5,111,0,0,103,104,5,114,0,
		0,104,24,1,0,0,0,105,106,5,44,0,0,106,26,1,0,0,0,107,108,5,100,0,0,108,
		109,5,111,0,0,109,28,1,0,0,0,110,111,5,100,0,0,111,112,5,111,0,0,112,113,
		5,110,0,0,113,114,5,101,0,0,114,30,1,0,0,0,115,116,5,119,0,0,116,117,5,
		104,0,0,117,118,5,105,0,0,118,119,5,108,0,0,119,120,5,101,0,0,120,32,1,
		0,0,0,121,122,5,61,0,0,122,34,1,0,0,0,123,124,5,40,0,0,124,36,1,0,0,0,
		125,126,5,41,0,0,126,38,1,0,0,0,127,128,5,38,0,0,128,129,5,38,0,0,129,
		40,1,0,0,0,130,131,5,124,0,0,131,132,5,124,0,0,132,42,1,0,0,0,133,134,
		5,36,0,0,134,44,1,0,0,0,135,137,7,0,0,0,136,135,1,0,0,0,136,137,1,0,0,
		0,137,138,1,0,0,0,138,142,7,1,0,0,139,141,7,2,0,0,140,139,1,0,0,0,141,
		144,1,0,0,0,142,140,1,0,0,0,142,143,1,0,0,0,143,46,1,0,0,0,144,142,1,0,
		0,0,145,148,3,45,22,0,146,148,3,49,24,0,147,145,1,0,0,0,147,146,1,0,0,
		0,148,48,1,0,0,0,149,153,5,34,0,0,150,152,8,3,0,0,151,150,1,0,0,0,152,
		155,1,0,0,0,153,151,1,0,0,0,153,154,1,0,0,0,154,156,1,0,0,0,155,153,1,
		0,0,0,156,157,5,34,0,0,157,50,1,0,0,0,158,160,7,4,0,0,159,158,1,0,0,0,
		159,160,1,0,0,0,160,162,1,0,0,0,161,163,7,5,0,0,162,161,1,0,0,0,163,164,
		1,0,0,0,164,162,1,0,0,0,164,165,1,0,0,0,165,52,1,0,0,0,166,168,7,6,0,0,
		167,166,1,0,0,0,168,169,1,0,0,0,169,167,1,0,0,0,169,170,1,0,0,0,170,171,
		1,0,0,0,171,172,6,26,0,0,172,54,1,0,0,0,173,175,5,13,0,0,174,173,1,0,0,
		0,174,175,1,0,0,0,175,176,1,0,0,0,176,177,5,10,0,0,177,56,1,0,0,0,178,
		182,5,35,0,0,179,181,8,7,0,0,180,179,1,0,0,0,181,184,1,0,0,0,182,180,1,
		0,0,0,182,183,1,0,0,0,183,185,1,0,0,0,184,182,1,0,0,0,185,186,3,55,27,
		0,186,187,1,0,0,0,187,188,6,28,0,0,188,58,1,0,0,0,10,0,136,142,147,153,
		159,164,169,174,182,1,6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
