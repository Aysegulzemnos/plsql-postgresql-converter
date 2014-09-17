package ru.barsopen.plsqlconverter.ast.typed;
public interface expression_element {
  // implemented by: case_statement, constant, general_element, hosted_variable_name, subquery, expression_element_or, expression_element_and, expression_element_eq, expression_element_neq, expression_element_lt, expression_element_gt, expression_element_lte, expression_element_gte, expression_element_concat, expression_element_plus, expression_element_minus, expression_element_asterisk, expression_element_solidus, expression_element_percent, expression_element_mod, expression_element_div, expression_element_not, expression_element_not_null, expression_element_null, expression_element_not_nan, expression_element_nan, expression_element_not_present, expression_element_present, expression_element_not_infinite, expression_element_infinite, expression_element_not_a_set, expression_element_a_set, expression_element_not_empty, expression_element_empty, expression_element_not_in, expression_element_in, expression_element_not_between, expression_element_between, expression_element_like, expression_element_likec, expression_element_like2, expression_element_like4, expression_element_not_like, expression_element_unary, expression_element_prior, expression_element_stanrd, expression_element_some, expression_element_exists, expression_element_all, expression_element_any, expression_element_dot_asterisk, expression_element_found, expression_element_notfound, expression_element_rowcount, expression_element_isopen, expression_element_outer_join_sign
  org.antlr.runtime.tree.Tree unparse();
}
