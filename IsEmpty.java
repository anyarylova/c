// File generated by the BNF Converter (bnfc 2.9.5).

package org.syntax.stella.Absyn;

public class IsEmpty  extends Expr {
  public final Expr expr_;
  public int line_num, col_num, offset;
  public IsEmpty(Expr p1) { expr_ = p1; }

  public <R,A> R accept(org.syntax.stella.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof org.syntax.stella.Absyn.IsEmpty) {
      org.syntax.stella.Absyn.IsEmpty x = (org.syntax.stella.Absyn.IsEmpty)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}
