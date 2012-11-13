SyntaxHighlighter.brushes.Emacs = function()
{
 var keywords =	'require';
 var commands = 'M-x C-c C-u';

 this.regexList = [
     { regex: SyntaxHighlighter.regexLib.doubleQuotedString, css: 'string' }, // double quoted strings
     { regex: new RegExp(this.getKeywords(keywords), 'gm'), css: 'keyword' }, // keywords
     { regex: new RegExp(this.getKeywords(commands), 'gm'), css: 'functions' } // commands
                ];
}

SyntaxHighlighter.brushes.Emacs.prototype = new SyntaxHighlighter.Highlighter();
SyntaxHighlighter.brushes.Emacs.aliases = ['emacs'];
