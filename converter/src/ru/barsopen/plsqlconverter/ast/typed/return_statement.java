package ru.barsopen.plsqlconverter.ast.typed;
public class return_statement implements statement {
  public int _line = -1;
  public int _col = -1;
  public int _tokenStartIndex = -1;
  public int _tokenStopIndex = -1;
  public expression expression = null;
  public boolean is_expression() { return this.expression != null; }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(br.com.porcelli.parser.plsql.PLSQLParser.RETURN_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("RETURN_VK");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (expression != null) {
      _result.addChild(expression.unparse());
    }


    return _result;
  }

}
