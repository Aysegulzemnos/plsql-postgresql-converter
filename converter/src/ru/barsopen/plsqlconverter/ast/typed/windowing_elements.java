package ru.barsopen.plsqlconverter.ast.typed;
public interface windowing_elements extends windowing_clause_spec {
  // implemented by: windowing_elements_unbounded_preceding, windowing_elements_current_row, windowing_elements_preceding, windowing_elements_following
  org.antlr.runtime.tree.Tree unparse();
}
