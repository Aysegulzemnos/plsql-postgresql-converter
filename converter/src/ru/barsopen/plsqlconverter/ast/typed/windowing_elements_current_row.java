package ru.barsopen.plsqlconverter.ast.typed;
public class windowing_elements_current_row implements windowing_elements {
  public int _line = -1;
  public int _col = -1;
  public int _tokenStartIndex = -1;
  public int _tokenStopIndex = -1;
  public org.antlr.runtime.tree.Tree ROW_VK = null;

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(br.com.porcelli.parser.plsql.PLSQLParser.CURRENT_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("CURRENT_VK");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (ROW_VK == null) { throw new RuntimeException(); }
    _result.addChild(ROW_VK);


    return _result;
  }

}
